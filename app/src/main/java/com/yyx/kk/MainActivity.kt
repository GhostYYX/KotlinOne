package com.yyx.kk

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.yyx.kk.activity.WebViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "Hello，欢迎来到小心Android至Kotlin"

        web_view.setOnClickListener{
            toast("跳转页面")
            val intent = Intent(this,WebViewActivity::class.java)
            startActivity(intent)
        }
    }



    fun toast(va:String){
        Toast.makeText(this,va, Toast.LENGTH_LONG).show()
    }
}
