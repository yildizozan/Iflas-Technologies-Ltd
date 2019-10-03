package com.yildizozan;

public interface PhoneComponentFactory {
    ComponentDisplay createDisplay(ComponentDisplaySize size);
    ComponentBattery createBattery(int hour, int mAh);
    ComponentCPURAM createCPURAM(double cpu, int ram);
    ComponentStorage createStorage(boolean microSD, int capacity);
    ComponentCamera createCamera(int front, int rear);
    ComponentCase createCase(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material);
}
