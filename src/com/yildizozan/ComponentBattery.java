package com.yildizozan;

public abstract class ComponentBattery {
    protected int hour = 20;
    protected int mAh = 2800;

    public ComponentBattery(int hour, int mAh) {
        this.hour = hour;
        this.mAh = mAh;
    }
}
