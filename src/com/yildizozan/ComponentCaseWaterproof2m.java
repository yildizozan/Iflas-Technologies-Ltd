package com.yildizozan;

public class ComponentCaseWaterproof2m extends ComponentCase {
    public ComponentCaseWaterproof2m(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material) {
        super(sizes, dustproof, waterproof, material);
    }

    @Override
    public String toString() {
        return  "sizes " + sizes + "," +
                " dustproof " + (dustproof ? "support" : "not support") + "," +
                " waterproof " + (waterproof ? "support 2m" : "not support") + "," +
                " case material " + (material == ComponentCaseMaterial.ALUMINUM ? "aluminum" : "plastic") + ".";
    }
}
