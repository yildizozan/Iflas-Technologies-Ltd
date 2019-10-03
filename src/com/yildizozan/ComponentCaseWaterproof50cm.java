package com.yildizozan;

public class ComponentCaseWaterproof50cm extends ComponentCase {
    public ComponentCaseWaterproof50cm(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material) {
        super(sizes, dustproof, waterproof, material);
    }

    @Override
    public String toString() {
        return  "sizes " + sizes + "," +
                " dustproof " + (dustproof ? "support" : "not support") + "," +
                " waterproof " + (waterproof ? "support 50cm" : "not support") + "," +
                " case material " + (material == ComponentCaseMaterial.ALUMINUM ? "aluminum" : "plastic") + ".";
    }
}
