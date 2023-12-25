package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    // Fridge interface definition
    public interface Fridge {
        void openDoor();
        void findMilk();
        void takeMilk();

        void openFridgeDoor();

        boolean checkForMilk();

        void closeFridgeDoor();
    }

    // Concrete implementation of the Fridge interface
    public class MyFridge implements Fridge {
        @Override
        public void openDoor() {
            // Code to open the fridge door
            System.out.println("At first, we should open the fridge =)");
        }

        @Override
        public void findMilk() {
            // Code to locate the milk inside the fridge
            System.out.println("I think we should use 3 actions to get 1 bottle of milk =) ");
        }

        @Override
        public void takeMilk() {
            // Code to take the milk from the fridge
            System.out.println("Milk is taken from the fridge.");
        }

        @Override
        public void openFridgeDoor() {

        }

        @Override
        public boolean checkForMilk() {
            return false;
        }

        @Override
        public void closeFridgeDoor() {

        }
    }

    // Class implementing the fridge algorithm

    public void fridgeAlgorithm(Fridge fridge) {
        fridge.openFridgeDoor();

        if (fridge.checkForMilk()) {
            fridge.takeMilk();
        }

        fridge.closeFridgeDoor();
    }
}
