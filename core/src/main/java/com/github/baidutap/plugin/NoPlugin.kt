package com.github.baidutap.plugin

import com.github.baidutap.Core.app

object NoPlugin : Plugin() {
    override val id: String get() = ""
    override val label: CharSequence get() = app.getText(com.github.baidutap.core.R.string.plugin_disabled)
}
