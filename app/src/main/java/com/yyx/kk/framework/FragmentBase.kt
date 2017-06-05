package com.yyx.kk.framework

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by vimi8 on 2017/6/5.
 */
abstract class FragmentBase: Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view = inflater!!.inflate(initLayoutViews(), container, false)
        initViewsAndStaticData(view)
        return view
    }


    /**
     * 获取布局资源
     */
     abstract fun initLayoutViews(): Int

    /**
     * 装载视图和设置不变的适配器数据等(动态从接口获取的数据,应该实现ILoadData接口,通过)
     */
    abstract fun initViewsAndStaticData(view: View)

}