package com.qkikakiood.animations;

public enum MyPagerEnum {

    RED(R.string.black, R.layout.fragment_black),
    BLUE(R.string.blue, R.layout.fragment_blue),
    ORANGE(R.string.purple, R.layout.fragment_purple);

    private int titleId;
    private int layoutId;

    MyPagerEnum(int titleId, int layoutId) {
        titleId = titleId;
        layoutId = layoutId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getLayoutId() {
        return layoutId;
    }

}