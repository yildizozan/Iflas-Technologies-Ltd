package com.yildizozan;

public class ComponentBatteryLithiumIon extends ComponentBattery {
    public ComponentBatteryLithiumIon(int hour, int mAh) {
        super(hour, mAh);
    }

    @Override
    public String toString() {
        return "battery type lithium-ion, " + hour + " hour, "  + mAh + "mAh";
    }
}
