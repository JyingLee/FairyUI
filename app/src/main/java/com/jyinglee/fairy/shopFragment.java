package com.jyinglee.fairy;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/**
 * Created by Jying on 2017/5/24.
 */
/**
 * 商店的fragment
 */
public class shopFragment extends Fragment {
    Button chongzhi;
    PopupWindow mpopupWindow;
    ImageButton close;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.shop_fragment, container, false);
        chongzhi = (Button) view.findViewById(R.id.chongzhi_bt);
        final View contentview = getActivity().getLayoutInflater().inflate(R.layout.chongzhi_popupwindow, null);
        mpopupWindow = new PopupWindow(contentview, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT
                , true);
        mpopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        mpopupWindow.setAnimationStyle(R.style.anim_menu);
        mpopupWindow.setOnDismissListener(new poponDismissListener());
        chongzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backgroundAlpha(0.5f);
                mpopupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

            }
        });
        close = (ImageButton) contentview.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
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
