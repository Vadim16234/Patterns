package org.example.creatingPatterns.abstractFactory;

public class EnDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new EuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EuTouchpad();
    }
}
