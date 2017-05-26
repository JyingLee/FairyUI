package com.jyinglee.fairy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jying on 2017/5/25.
 */
/**
 *背包窗口的recyclewview的adapter
 * */
public class beibaoAdapter extends RecyclerView.Adapter<beibaoAdapter.ViewHolder> {
    List<cardBean> lists = new ArrayList<>();

    public beibaoAdapter(List<cardBean> lists) {
        this.lists = lists;
    }

    @Override
    public beibaoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(beibaoAdapter.ViewHolder holder, int position) {
        holder.kuan.setImageResource(lists.get(position).getKuan());
        holder.hero.setImageResource(lists.get(position).getHero());
        holder.dengji.setImageResource(lists.get(position).getDengji());
        holder.textDengji.setText("LV."+lists.get(position).getTextDengji());
        holder.shuxing.setImageResource(lists.get(position).getFalg());
        ImageView star[]={holder.star1,holder.star2,holder.star3,holder.star4};
        int count=lists.get(position).getStar();
        for (int i=0;i<count;i++){
            star[i].setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        //参数:框，英雄，等级ABCDS，卡片等级,星星数量,右上角属性
        ImageView kuan;
        ImageView hero;
        ImageView dengji;
        TextView textDengji;
        ImageView star1;
        ImageView star2;
        ImageView star3;
        ImageView star4;
        ImageView shuxing;

        public ViewHolder(View itemView) {
            super(itemView);
            kuan= (ImageView) itemView.findViewById(R.id.kuan_select);
            hero= (ImageView) itemView.findViewById(R.id.hero_select);
            dengji= (ImageView) itemView.findViewById(R.id.dengji_select);
            textDengji= (TextView) itemView.findViewById(R.id.textDengji_select);
            star1= (ImageView) itemView.findViewById(R.id.stat1);
            star2= (ImageView) itemView.findViewById(R.id.stat2);
            star3= (ImageView) itemView.findViewById(R.id.stat3);
            star4= (ImageView) itemView.findViewById(R.id.stat4);
            shuxing= (ImageView) itemView.findViewById(R.id.shuxing_select);
        }
    }
}
