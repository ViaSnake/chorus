package org.chorusmc.chorus.menubar.help

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.value.ObservableValue
import org.chorusmc.chorus.menubar.MenuBarAction
import org.chorusmc.chorus.nodes.control.UrlLabel
import org.chorusmc.chorus.views.HelpView

/**
 * @author Gio
 */
class ReportABug : MenuBarAction {

    override val binding: ObservableValue<Boolean>
        get() = SimpleBooleanProperty(false)

    override fun onAction() {
        val helpView = HelpView("Report a bug")
        helpView.addText("If you find out bugs or if something wrong happens, please open an issue on GitHub.")
        helpView.addNode(UrlLabel("Click here to report a bug", "https://github.com/iAmGio/chorus/issues"))
        helpView.show()
    }
}