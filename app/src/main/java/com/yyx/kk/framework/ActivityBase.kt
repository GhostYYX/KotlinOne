package com.yyx.kk.framework

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by vimi8 on 2017/5/31.
 */
abstract class ActivityBase :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            setContentView(initLayoutViews())
            initViewsAndStaticData()
        }catch (e:Exception){

        }
    }

    //Toast弹窗
    fun Toast(va:String){
        Toast.makeText(this,va, Toast.LENGTH_LONG).show()
    }




    /**
     * 获取布局资源
     */
    abstract fun initLayoutViews(): Int

    /**
     * 装载视图和设置不变的适配器数据等(动态从接口获取的数据,应该实现ILoadData接口,通过)
     */
    abstract fun initViewsAndStaticData()
}