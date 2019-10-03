package com.yildizozan;

public class PhoneMaximumEffort extends Phone {

    PhoneMaximumEffort (PhoneComponentFactory pcf) {
        attachComponents(pcf);
    }

    @Override
    void attachComponents(PhoneComponentFactory factory) {
        this.componentDisplay = factory.createDisplay(ComponentDisplaySize.INCHES_55);
        this.componentBattery = factory.createBattery(20, 2800);
        this.componentCPURAM = factory.createCPURAM(2.8, 8);
        this.componentStorage = factory.createStorage(true, 64);
        this.componentCamera = factory.createCamera(12, 8);
        this.componentCase = factory.createCase("151x73x7.7", true, true, ComponentCaseMaterial.ALUMINUM);

        attachDisplay();
        attachBattery();
        attachCPURAM();
        attachStorage();
        attachCamera();
        attachCase();
    }
}
