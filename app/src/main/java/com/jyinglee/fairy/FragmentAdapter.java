package com.jyinglee.fairy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jying on 2017/5/24.
 */
/**
 *继承FragmentPagerAdapter，内存可以缓存fragment
 * */
public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> list = new ArrayList<>();

    public FragmentAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
