package com.alerty.app;

public class Chain {
    public static void batteryDataToAction(BatteryDataModel batteryData, Actuators actuators) {
        // ----------- STEP 6 code starts -------
        // Two stage chain to classify battery data and take action

        // BatteryClassifier.BatteryState batteryState = BatteryClassifier.classify(batteryData);
        // if (batteryState != BatteryClassifier.BatteryState.OK) {
        //     actuators.sendEmail("manager@battery.com", "Battery Alert", "Battery temperature is too high", "noreply@battery.com");
        // }

        // ----------- STEP 6 code ends -------
    }
}
