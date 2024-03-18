package org.example.creatingPatterns.abstractFactory;

interface DeviceFactory {
    Mouse getMouse();

    Keyboard getKeyboard();

    Touchpad getTouchpad();
}
