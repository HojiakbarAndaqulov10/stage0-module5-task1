package com.epam.mjc.stage0.utils;

public interface Fridge {

    void close();

    void open();

    void getMilk();

    void openFridgeDoor();

    boolean checkForMilk();

    void openDoor();

    void findMilk();

    void takeMilk();

    void closeFridgeDoor();

    void openFridge();

    boolean checkContents(String milk);

    void takeItem(String milk);

    void closeFridge();

    boolean containsMilk();
}
