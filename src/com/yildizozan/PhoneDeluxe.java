package com.yildizozan;

public class PhoneDeluxe extends Phone {

    PhoneDeluxe (PhoneComponentFactory pcf) {
        attachComponents(pcf);
    }

    @Override
    void attachComponents (PhoneComponentFactory factory) {

        this.componentDisplay = factory.createDisplay(ComponentDisplaySize.INCHES_53);
        this.componentBattery = factory.createBattery(27, 3600);
        this.componentCPURAM = factory.createCPURAM(2.2, 6);
        this.componentStorage = factory.createStorage(true, 32);
        this.componentCamera = factory.createCamera(12, 5);
        this.componentCase = factory.createCase("149x3x7.7", false, true, ComponentCaseMaterial.ALUMINUM);

        // Montaj
        attachDisplay();
        attachBattery();
        attachCPURAM();
        attachStorage();
        attachCamera();
        attachCase();
    }
}
