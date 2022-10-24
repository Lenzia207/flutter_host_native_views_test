package com.example.flutter_host_native_view_test

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView

internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val textView: TextView


    override fun getView(): View {
        return textView
    }

    override fun dispose() {}

    init {
        textView = TextView(context)
        textView.textSize = 32f

        textView.setBackgroundColor(Color.rgb(225, 254, 67))
        textView.text = "Rendered on a native Android view, SO COOL"
    }
}
