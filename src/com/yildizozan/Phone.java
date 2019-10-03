package com.yildizozan;

public abstract class Phone {

    protected ComponentDisplay componentDisplay;
    protected ComponentBattery componentBattery;
    protected ComponentCPURAM componentCPURAM;
    protected ComponentStorage componentStorage;
    protected ComponentCamera componentCamera;
    protected ComponentCase componentCase;

    abstract void attachComponents (PhoneComponentFactory factory);

    public void attachDisplay() {
        System.out.println("Attach display " + componentDisplay);
    }
    public void attachBattery() {
        System.out.println("Attach battery " + componentBattery);
    }
    public void attachCPURAM() {
        System.out.println("Attach CPU & RAM " + componentCPURAM);
    }
    public void attachStorage() {
        System.out.println("Attach storage " + componentStorage);
    }
    public void attachCamera() {
        System.out.println("Attach camera " + componentCamera);
    }
    public void attachCase() {
        System.out.println("Attach case " + componentCase);
    }
}
