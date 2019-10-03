package com.yildizozan;

public class PhoneFactoryTurkish extends PhoneFactory {

    private PhoneComponentFactory factory  = new PhoneComponentFactoryTurkey();

    @Override
    protected Phone createPhone(PhoneType model) {

        if (model == PhoneType.IflasDeluxe)
            return new PhoneDeluxe(factory);
        else if (model == PhoneType.MaximumEffort)
            return new PhoneMaximumEffort(factory);

        return null;
    }
}
