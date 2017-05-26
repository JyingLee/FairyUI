package com.jyinglee.fairy;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/**
 * Created by Jying on 2017/5/24.
 */

/**
 * 首页的第一个fragment
 */
public class shouyeFragment extends Fragment {
    ImageView beibao;
    PopupWindow mpopupWindow;
    ImageView close1;
    View contentview;
    RecyclerView recyclerView;
    beibaoAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.index_fragment, container, false);
        beibao = (ImageView) view.findViewById(R.id.beibao_select);

        contentview = getActivity().getLayoutInflater().inflate(R.layout.beibao_popupwindow, null);
        mpopupWindow = new PopupWindow(contentview, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT
                , true);
        mpopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        mpopupWindow.setAnimationStyle(R.style.anim_menu);
        mpopupWindow.setOnDismissListener(new poponDismissListener());
        beibao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backgroundAlpha(0.5f);
                mpopupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
            }
        });

        recyclerView = (RecyclerView) contentview.findViewById(R.id.recyclerView);
        adapter = new beibaoAdapter(new getItemList().getCardLists());
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 5));
        recyclerView.setAdapter(adapter);

        close1 = (ImageView) contentview.findViewById(R.id.beibao_close1);
        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpopupWindow.dismiss();
            }
        });
        return view;
    }

    public void backgroundAlpha(float bgAlpha) {  //修改activity背景亮度
        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
        lp.alpha = bgAlpha;
        getActivity().getWindow().setAttributes(lp);
    }

    class poponDismissListener implements PopupWindow.OnDismissListener {

        @Override
        public void onDismiss() {
            backgroundAlpha(1f);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
