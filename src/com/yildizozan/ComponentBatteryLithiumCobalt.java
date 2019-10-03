package com.yildizozan;

public class ComponentBatteryLithiumCobalt extends ComponentBattery {
    public ComponentBatteryLithiumCobalt(int hour, int mAh) {
        super(hour, mAh);
    }

    @Override
    public String toString() {
        return "battery type lithium-cobalt, " + hour + " hour, "  + mAh + "mAh";
    }
}
