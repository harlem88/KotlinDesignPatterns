package org.dronix.kotlin.designpatterns.behavioral.mediator

class FontDialogDirector : DialogDirector {
    private var okBtn: Button? = null
    private var cancelBtn: Button? = null
    private var fontList: ListBox? = null
    private var fontName: EntryField? = null

    override fun createWidgets() {
        okBtn = Button(this)
        cancelBtn = Button(this)
        fontList = ListBox(this)
        fontName = EntryField(this)
    }

    override fun widgetChanged(widget: Widget) {
        when (widget) {
            okBtn       -> { }
            fontList    -> fontName?.setText(fontList?.getSelection() ?: "")
            cancelBtn   -> { }
        }
    }
}