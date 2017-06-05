package com.yyx.kk.framework.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.githang.viewpagerindicator.IconPagerAdapter

/**
 * Created by vimi8 on 2017/6/5.
 */
class MainAdapter(fm: FragmentManager?, f: List<Fragment>, i: Array<Int>,s: Array<String>) : IconPagerAdapter, FragmentPagerAdapter(fm) {

    var FRAGMENT:List<Fragment> = f

    var ICONS = i

    var TITLE = s


    override fun getPageTitle(position: Int): CharSequence {
        return TITLE[position]
    }

    override fun getIconResId(p0: Int): Int {
        return ICONS[p0]
    }


    override fun getCount(): Int {
        return ICONS.size
    }

    override fun getItem(p0: Int): Fragment {
        return FRAGMENT[p0]
    }
}