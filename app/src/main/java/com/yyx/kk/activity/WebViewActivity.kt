package com.yyx.kk.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import com.yyx.kk.R
import kotlinx.android.synthetic.main.activity_web_view.*

/**
 * Created by vimi8 on 2017/5/23.
 */
class WebViewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        web_view.settings.javaScriptEnabled = true

        web_view.setWebViewClient(WebViewClient())

        web_view.loadUrl("http://blog.csdn.net/android_yyx")

    }
}