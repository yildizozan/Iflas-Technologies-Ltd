package com.yildizozan;

public class ComponentCPURAM2Core extends ComponentCPURAM {
    public ComponentCPURAM2Core(double cpu, int ram) {
        super(cpu, ram);
    }


    @Override
    public String toString() {
        return "2 core " + cpu + " GHz, " + ram + " GB.";
    }
}
