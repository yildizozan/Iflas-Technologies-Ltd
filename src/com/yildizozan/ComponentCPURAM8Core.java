package com.yildizozan;

public class ComponentCPURAM8Core extends ComponentCPURAM {
    public ComponentCPURAM8Core(double cpu, int ram) {
        super(cpu, ram);
    }

    @Override
    public String toString() {
        return "8 core " + cpu + " GHz, " + ram + " GB.";
    }
}
