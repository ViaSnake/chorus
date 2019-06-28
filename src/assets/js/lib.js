// Cached variable, should not be accessed to
var thisAddon;

/**
 * Used to allow string translation. See wiki for further information
 */
var translationMap;

/**
 * Returns the corresponding Java class
 * @param name Java class (with package)
 */
function type(name) {
    return Java.type(name);
}

/**
 * Returns the corresponding Java/Kotlin class from Chorus source
 * @param name Java/Kotlin class (with package starting from Chorus main package)
 */
function chorus_type(name) {
    return type('org.chorusmc.chorus.' + name);
}

/**
 * Chorus' main class instance
 * @type org.chorusmc.Chorus
 */
var chorus = chorus_type('Chorus').getInstance();

/**
 * Chorus' version
 * @type java.lang.String
 */
var version = chorus_type('Chorus').VERSION

/**
 * Translates a string based on translationMap. English value is returned if there is not any translation for current locale
 * @param key translation key present in translationMap
 * @return java.lang.String
 */
function translate(key) {
    var locale = chorus.getResourceBundle().getLocale().toLanguageTag();
    var subTranslationMap = translationMap[key];
    if(!subTranslationMap) {
        print('Error: there is no translation key ' + key);
        return;
    }
    var translation = subTranslationMap[locale];
    return translation ? translation : subTranslationMap['en']
}

/**
 * Returns a list of loaded add-ons
 * @return java.util.List<org.chorusmc.addon.Addon>
 */
function getAddons() {
    return chorus_type('addon.Addons').INSTANCE.getAddons()
}

/**
 * Returns this add-on
 * @return org.chorusmc.addon.Addon
 */
function getThisAddon() {
    if (thisAddon) return thisAddon;
    thisAddon = getAddons()
        .stream()
        .filter(function (addon) {
            return addon.name == name
        })
        .findAny()
        .orElse(null);
    return thisAddon;
}

/**
 * Returns the add-on's folder where data can be saved
 * @return java.util.File
 */
function getFolder() {
    return getThisAddon().getFolder();
}

/**
 * Creates the config for the add-on
 * @param values key-value map
 */
function createConfig(values) {
    getThisAddon().createConfig(values);
}

/**
 * Returns add-on's config (if exists). MUST be preceded by createConfig
 * @return org.chorusmc.addon.Addon$AddonConfiguration
 */
function getConfig() {
    return getThisAddon().getConfig();
}

/**
 * Creates a menu-bar button
 * @param id identifier
 * @param name visible name of the button
 * @return org.chorusmc.chorus.menubar.MenuBarMainButton
 */
function createMenuBarButton(id, name) {
    var MenuBarMainButtonClass = chorus_type('menubar.MenuBarMainButton');
    var button = new MenuBarMainButtonClass();
    button.setText(name);
    chorus_type('menubar.MenuBar').INSTANCE.getIds().put(id, button);
    chorus_type('editor.EditorController').getInstance().menuBar.getMenus().add(button);
    return button;
}

/**
 * Gets a menu-bar button by ID
 * @param id identifier
 * @return org.chorusmc.chorus.menubar.MenuBarMainButton
 */
function getMenuBarButton(id) {
    return chorus_type('menubar.MenuBar').INSTANCE.getIds().get(id);
}

/**
 * Opens a new menu
 * @param type menu type (string) or menu instance
 * @param x optional x value
 * @param y optional y value
 */
function openDropMenu(type, x, y) {
    var menu = typeof type == 'string' ? chorus_type('menus.Showables').newMenu(type) : type;
    if (!menu) {
        print('Error: no menu ' + type);
        return;
    }
    chorus_type('menus.drop.MainDropMenu').quickOpen(menu, x == undefined ? null : x, y == undefined ? null : y);
}

/**
 * Used by drop-menu buttons to create sub-menus
 * @param type new menu type
 */
function newMenuAction(type) {
    var NewMenuActionClass = chorus_type('menus.drop.actions.NewMenuAction');
    return new NewMenuActionClass(type);
}

/**
 * Utility function to create drop-menu buttons. Should not be accessed to
 * @param text button text
 * @param action button action
 */
function dm_button(text, action) {
    var ButtonClass = chorus_type('menus.drop.DropMenuButton');
    return new ButtonClass(text, action, false);
}

/**
 * Creates a new custom drop-menu
 * @param type string identifier
 * @param buttons text-action map to generate buttons
 */
function DropMenu(type, buttons) {
    var DropMenuClass = chorus_type('menus.drop.DropMenu');
    var DropMenuExtender = Java.extend(DropMenuClass, {
        getButtons: function() {
            var updatedButtons = new ArrayList();
            for(i = 0; i < buttons.length; i++) {
                for(text in buttons[i]) {
                    updatedButtons.add(dm_button(text, buttons[i][text]));
                }
            }
            return updatedButtons;
        }
    });
    var dropMenu = new DropMenuExtender()
    dropMenu.type = type;
    return dropMenu;
}

/**
 * Returns current theme
 * @return org.chorusmc.theme.Theme
 */
function getTheme() {
    return chorus_type('theme.Themes').byConfig();
}

/**
 * Sets active theme
 * @param name theme name
 * @param internal whether or not the theme is internal (included in source) or external (from themes folder)
 */
function setTheme(name, internal) {
    var ThemeClass = chorus_type('theme.Theme');
    chorus.setTheme(new ThemeClass(name, internal));
}

// --- JAVA TYPES UTILITIES --- //

function ArrayList() {
    return new java.util.ArrayList();
}

function HashMap() {
    return new java.util.HashMap();
}

function File(name, parent) {
    if(!parent) return new java.io.File(name);
    return new java.io.File(parent, name);
}

/**
 * @param key main key
 * @param modifiers array of modifiers (shift, control, alt)
 * @return javafx.scene.input.KeyCodeCombination
 */
function KeyCombination(key, modifiers) {
    var KeyCodeCombination = javafx.scene.input.KeyCodeCombination;
    var KeyCombination = javafx.scene.input.KeyCombination;
    var keyCode = javafx.scene.input.KeyCode.valueOf(key.toUpperCase());
    var keyModifiers = [];

    for(i = 0; i < modifiers.length; i++) {
        var modifier = modifiers[i].toLowerCase();
        keyModifiers.push(
            modifier == 'shift' ? KeyCombination.SHIFT_DOWN :
                modifier == 'control' ? KeyCombination.CONTROL_DOWN :
                    modifier == 'alt' ? KeyCombination.ALT_DOWN : null
        );
    }
    return new KeyCodeCombination(keyCode, keyModifiers)
}