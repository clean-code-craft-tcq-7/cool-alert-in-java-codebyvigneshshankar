package com.alerty.app;

public class BatteryClassifier {
    public enum BatteryState {
        OK,
        ALERT
    }

    public static BatteryState classify(BatteryDataModel batteryData) {
        // ----------- STEP 5 code starts -------
        // Classify battery data based on thresholds

        // double threshold = Thresholds.alertTemperature(batteryData.thermalManagementType);
        // if (batteryData.temperature > threshold) {
        //     return BatteryState.ALERT;
        // }

        // ----------- STEP 5 code ends -------
        return BatteryState.OK;
    }
}
