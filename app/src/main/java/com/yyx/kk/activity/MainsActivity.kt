package com.yyx.kk.activity

import android.support.v4.app.Fragment
import com.yyx.kk.R
import com.yyx.kk.fragment.M1
import com.yyx.kk.fragment.M2
import com.yyx.kk.framework.ActivityBase
import com.yyx.kk.framework.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_m.*

/**
 * Created by vimi8 on 2017/6/5.
 */
class MainsActivity : ActivityBase() {


    val ICONS = arrayOf(
            R.drawable.activity_main_tab_farm,
            R.drawable.activity_main_tab_dynamic,
            R.drawable.activity_main_tab_service,
            R.drawable.activity_main_tab_my )

    val TITLE = arrayOf(
            "首页",
            "信息",
            "服务",
            "我的")
    val FRAGMENT = initFragment()
    fun initFragment():List<Fragment> {
        var ff = listOf<Fragment>(M1(), M2(), M1(), M2())
        return ff
    }


    override fun initLayoutViews(): Int {
        return R.layout.activity_m
    }

    override fun initViewsAndStaticData() {
        var mf: MainAdapter = MainAdapter(supportFragmentManager,FRAGMENT,ICONS,TITLE)
        view_pager.adapter = mf
        indicator.setViewPager(view_pager)
    }





}