package com.yildizozan;

public class PhoneComponentFactoryTurkey implements PhoneComponentFactory {

    @Override
    public ComponentDisplay createDisplay(ComponentDisplaySize size) {
        return new ComponentDisplay32Bit(size);
    }

    @Override
    public ComponentBattery createBattery(int hour, int mAh) {
        return new ComponentBatteryLithiumBoron(hour, mAh);
    }

    @Override
    public ComponentCPURAM createCPURAM(double cpu, int ram) {
        return new ComponentCPURAM8Core(cpu, ram);
    }

    @Override
    public ComponentStorage createStorage(boolean microSD, int capacity) {
        return new ComponentStorageMAX128GB(microSD, capacity);
    }

    @Override
    public ComponentCamera createCamera(int front, int rear) {
        return new ComponentCamera4X(front, rear);
    }

    @Override
    public ComponentCase createCase(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material) {
        return new ComponentCaseWaterproof2m(sizes, dustproof, waterproof, material);
    }
}
