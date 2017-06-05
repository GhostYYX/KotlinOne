package com.yyx.kk

import android.content.Intent
import com.yyx.kk.activity.MainsActivity
import com.yyx.kk.activity.WebViewActivity
import com.yyx.kk.framework.ActivityBase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ActivityBase(){


    override fun initViewsAndStaticData() {

        web_view.setOnClickListener{
            val intent = Intent(this,WebViewActivity::class.java)
            startActivity(intent)
        }
        web_main.setOnClickListener{

            val intent = Intent(this, MainsActivity::class.java)
            startActivity(intent)
        }
    }


    override fun initLayoutViews(): Int {
        return R.layout.activity_main
    }







}


