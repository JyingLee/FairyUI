package com.jyinglee.fairy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jying on 2017/5/24.
 */
/**
 * 首页
 * */
public class indexActivity extends FragmentActivity implements View.OnClickListener {
    BanViewPager viewPager;
    List<Fragment> fragments;
    FragmentAdapter adapter;
    shouyeFragment shouye;
    shopFragment shop;
    ImageButton shouye_bt;
    ImageButton shop_bt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
        adapter = new FragmentAdapter(this.getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        viewPager.setScanScroll(false);
    }

    private void init() {
        fragments = new ArrayList<>();
        viewPager = (BanViewPager) findViewById(R.id.viewpager);
        shouye_bt = (ImageButton) findViewById(R.id.shouye_main);
        shop_bt = (ImageButton) findViewById(R.id.shop_main);
        shouye = new shouyeFragment();
        shop = new shopFragment();
        fragments.add(shouye);
        fragments.add(shop);
        shouye_bt.setOnClickListener(indexActivity.this);
        shop_bt.setOnClickListener(indexActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shouye_main:
                viewPager.setCurrentItem(0);
                break;
            case R.id.shop_main:
                viewPager.setCurrentItem(1);
                break;
        }
    }
}
