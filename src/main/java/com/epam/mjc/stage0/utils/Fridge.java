package com.epam.mjc.stage0.utils;

public interface Fridge {

    void close();

    void open();

    void getMilk();

    void openFridgeDoor();

    boolean checkForMilk();

    void takeMilk();

    void closeFridgeDoor();
}
