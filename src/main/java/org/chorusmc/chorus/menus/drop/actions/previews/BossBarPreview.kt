package org.chorusmc.chorus.menus.drop.actions.previews

import javafx.scene.control.TextField
import org.chorusmc.chorus.editor.EditorArea
import org.chorusmc.chorus.menus.coloredtextpreview.ColoredTextPreviewMenu
import org.chorusmc.chorus.menus.coloredtextpreview.previews.BossBarPreviewImage
import org.chorusmc.chorus.menus.drop.actions.DropMenuAction
import org.chorusmc.chorus.minecraft.chat.ChatParser
import org.chorusmc.chorus.util.translate

/**
 * @author Giorgio Garofalo
 */
class BossBarPreview : DropMenuAction() {

    override fun onAction(area: EditorArea, x: Double, y: Double) {
        val textfield = TextField(selectedText)
        textfield.promptText = translate("preview.bossbar.text_prompt")
        val menu = ColoredTextPreviewMenu(translate("preview.bossbar"), BossBarPreviewImage(selectedText), listOf(textfield))
        textfield.textProperty().addListener {_ ->
            menu.image.flows[0] = ChatParser(textfield.text, true).toTextFlow()
        }
        menu.layoutX = x
        menu.layoutY = y
        menu.show()
    }
}