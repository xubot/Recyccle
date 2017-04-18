package com.example.administrator.d;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/4/17 20:24
 */

public class Bean {
    private int img;
    private String name;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bean(int img, String name) {

        this.img = img;
        this.name = name;
    }
}
