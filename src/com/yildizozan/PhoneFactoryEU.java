package com.yildizozan;

public class PhoneFactoryEU extends PhoneFactory {

    private PhoneComponentFactory factory  = new PhoneComponentFactoryEU();

    @Override
    protected Phone createPhone(PhoneType model) {

        if (model == PhoneType.IflasDeluxe)
            return new PhoneDeluxe(factory);
        else if (model == PhoneType.MaximumEffort)
            return new PhoneMaximumEffort(factory);

        return null;
    }
}
