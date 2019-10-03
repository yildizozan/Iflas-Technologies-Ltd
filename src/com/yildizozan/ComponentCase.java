package com.yildizozan;

public abstract class ComponentCase {
    protected String sizes;
    protected boolean dustproof = false;
    protected boolean waterproof = false;
    protected ComponentCaseMaterial material = ComponentCaseMaterial.PLASTIC;

    public ComponentCase(String sizes, boolean dustproof, boolean waterproof, ComponentCaseMaterial material) {
        this.sizes = sizes;
        this.dustproof = dustproof;
        this.waterproof = waterproof;
        this.material = material;
    }
}
