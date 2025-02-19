package com.epam.mjc.stage0.utils;

import com.epam.mjc.stage0.FridgeAlgorithm;

import java.util.LinkedList;

public class FridgeIml implements Fridge, FridgeAlgorithm.fridgeAlgorithm {

    private final LinkedList<Actions> actionsQueue = new LinkedList<>();

    @Override
    public void open() {
        actionsQueue.add(Actions.OPEN);
    }

    @Override
    public void getMilk() {
        actionsQueue.add(Actions.GET_MILK);
    }

    @Override
    public void openFridgeDoor() {

    }

    @Override
    public boolean checkForMilk() {
        return false;
    }

    @Override
    public void openDoor() {

    }

    @Override
    public void findMilk() {

    }

    @Override
    public void takeMilk() {

    }

    @Override
    public void closeFridgeDoor() {

    }

    @Override
    public void openFridge() {

    }

    @Override
    public boolean checkContents(String milk) {
        return false;
    }

    @Override
    public void takeItem(String milk) {

    }

    @Override
    public void closeFridge() {

    }

    @Override
    public boolean containsMilk() {
        return false;
    }

    @Override
    public void close() {
        actionsQueue.add(Actions.CLOSE);
    }

    public LinkedList<Actions> getActionsQueue() {
        return actionsQueue;
    }

    public enum Actions {
        OPEN,
        CLOSE,
        GET_MILK
    }
}
