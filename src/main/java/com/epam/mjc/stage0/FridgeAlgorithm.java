package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {
        public void fridgeAlgorithm(Fridge fridge) {
            // Step 1: Open the fridge
            fridge.open();

            // Step 2: Check if the milk is inside the fridge
            if (fridge.containsMilk()) {
                // Step 3: If milk is present, take it from the fridge
                fridge.takeMilk();
                System.out.println("Got the milk!");

                // Step 4: Close the fridge after taking the milk
                fridge.close();
            } else {
                // Step 5: If there is no milk, display a message and still close the fridge
                System.out.println("No milk found in the fridge!");
                fridge.close();
            }
        }

    public interface fridgeAlgorithm {
    }
}




