package com.jyinglee.fairy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jying on 2017/5/25.
 */

/**
 * 这个类用来直接生成每一个卡片英雄对象
 * */
public class getItemList {
    List<cardBean> cardLists = new ArrayList<>();

    //参数:框，英雄，等级ABCDS，卡片等级,星星数量,右上角属性
    public List<cardBean> getCardLists() {
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_mermaidqueen,R.mipmap.a_highlight,15,2,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_drakan,R.mipmap.b_highlight,1,4,R.mipmap.att_fire));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_captain_jack,R.mipmap.c_highlight,7,2,R.mipmap.att_water));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_mermaidqueen,R.mipmap.d_highlight,15,1,R.mipmap.att_wind));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_oceantriton,R.mipmap.s_highlight,5,2,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_oceaking,R.mipmap.a_highlight,6,4,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_mermaidqueen,R.mipmap.a_highlight,5,4,R.mipmap.att_fire));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_oceantriton,R.mipmap.c_highlight,15,1,R.mipmap.att_water));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_mermaidqueen,R.mipmap.a_highlight,85,2,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_mermaidqueen,R.mipmap.s_highlight,15,3,R.mipmap.att_water));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_drakan,R.mipmap.a_highlight,95,2,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_mermaidqueen,R.mipmap.c_highlight,1,3,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_oceantriton,R.mipmap.s_highlight,65,2,R.mipmap.att_wind));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_captain_jack,R.mipmap.a_highlight,66,4,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_oceaking,R.mipmap.s_highlight,2,4,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_mermaidqueen,R.mipmap.c_highlight,3,2,R.mipmap.att_water));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_drakan,R.mipmap.s_highlight,15,4,R.mipmap.att_earth));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_oceaking,R.mipmap.a_highlight,4,2,R.mipmap.att_wind));
        cardLists.add(new cardBean(R.mipmap.rare2,R.mipmap.ic_captain_jack,R.mipmap.s_highlight,5,1,R.mipmap.att_water));
        cardLists.add(new cardBean(R.mipmap.rare3,R.mipmap.ic_drakan,R.mipmap.a_highlight,5,4,R.mipmap.att_fire));
        return cardLists;
    }
}
