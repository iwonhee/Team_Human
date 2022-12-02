package com.example.and11_allview.human;

import java.io.Serializable;

public class HumanDTO implements Serializable {
    int iv_product;
    String tv_title, tv_intro, tv_price;

    public HumanDTO(int iv_product, String tv_title, String tv_intro, String tv_price) {
        this.iv_product = iv_product;
        this.tv_title = tv_title;
        this.tv_intro = tv_intro;
        this.tv_price = tv_price;
    }

    public void setIv_product(int iv_product) {
        this.iv_product = iv_product;
    }

    public void setTv_intro(String tv_intro) {
        this.tv_intro = tv_intro;
    }

    public int getIv_product() {
        return iv_product;
    }

    public String getTv_intro() {
        return tv_intro;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public void setTv_price(String tv_price) {
        this.tv_price = tv_price;
    }


    public String getTv_title() {
        return tv_title;
    }

    public String getTv_price() {
        return tv_price;
    }
}
