package com.jyinglee.fairy;

/**
 * Created by Jying on 2017/5/25.
 */

public class cardBean {
    int kuan;
    int hero;
    int dengji;
    int textDengji;
    int star;
    int falg;

    public cardBean(int kuan, int hero, int dengji, int textDengji, int star, int falg) {
        setKuan(kuan);
        setHero(hero);
        setDengji(dengji);
        setTextDengji(textDengji);
        setStar(star);
        setFalg(falg);
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    public int getHero() {
        return hero;
    }

    public void setHero(int hero) {
        this.hero = hero;
    }

    public int getDengji() {
        return dengji;
    }

    public void setDengji(int dengji) {
        this.dengji = dengji;
    }

    public int getTextDengji() {
        return textDengji;
    }

    public void setTextDengji(int textDengji) {
        this.textDengji = textDengji;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getFalg() {
        return falg;
    }

    public void setFalg(int falg) {
        this.falg = falg;
    }
}
