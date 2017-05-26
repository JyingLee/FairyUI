package com.jyinglee.fairy;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Jying on 2017/5/25.
 */
/**
 * 重写一个viewpager是为了禁止用户滑动
 * */
public class BanViewPager extends ViewPager {
    private boolean isCanScroll = true;

    public BanViewPager(Context context) {
        super(context);
    }

    public BanViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScanScroll(boolean isCanScroll) {
        this.isCanScroll = isCanScroll;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isCanScroll && super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return isCanScroll && super.onTouchEvent(ev);
    }
}
