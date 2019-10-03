package com.yildizozan;

public class ComponentCPURAM4Core extends ComponentCPURAM {
    public ComponentCPURAM4Core(double cpu, int ram) {
        super(cpu, ram);
    }

    @Override
    public String toString() {
        return "4 core " + cpu + " GHz, " + ram + " GB.";
    }
}
