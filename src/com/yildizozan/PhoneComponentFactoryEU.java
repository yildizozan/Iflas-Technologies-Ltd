package com.yildizozan;

public class PhoneComponentFactoryEU implements PhoneComponentFactory {

    @Override
    public ComponentDisplay createDisplay(ComponentDisplaySize size) {
        return new ComponentDisplay24Bit(size);
    }

    @Override
    public ComponentBattery createBattery(int hour, int mAh) {
        return new ComponentBatteryLithiumIon(hour, mAh);
    }

    @Override
    public ComponentCPURAM createCPURAM(double cpu, int ram) {
        return new ComponentCPURAM4Core(cpu, ram);
    }

    @Override
    public ComponentStorage createStorage(boolean microSD, int capacity) {
        return new ComponentStorageMAX64GB(microSD, capacity);
    }

    @Override
    public ComponentCamera createCamera(int front, int rear) {
        return new ComponentCamera3X(front, rear);
    }

    @Override
    public ComponentCase createCase(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material) {
        return new ComponentCaseWaterproof1m(sizes, dustproof, waterproof, material);
    }
}
