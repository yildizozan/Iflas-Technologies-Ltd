package com.yildizozan;

public class ComponentBatteryLithiumBoron extends ComponentBattery {
    public ComponentBatteryLithiumBoron(int hour, int mAh) {
        super(hour, mAh);
    }

    @Override
    public String toString() {
        return "battery type lithium-boron, " + hour + " hour, "  + mAh + "mAh";
    }
}
