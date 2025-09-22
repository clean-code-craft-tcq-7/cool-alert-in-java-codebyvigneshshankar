package com.alerty.app;

public final class App {
    // Private constructor to prevent instantiation
    private App() {}

// ----------- STEP 2 -----------------
// Minimal code to compile and fail the test

    public enum CoolingType {
        PASSIVE_COOLING,
        HI_ACTIVE_COOLING,
        MED_ACTIVE_COOLING
    }

    public static Action batteryTemperatureToAction(CoolingType coolingType, double temperatureInC) {
        // ------- STEP 3 -----------------
        // Minimal code to pass tests in test_cooling_alert.cpp

        // if (coolingType == CoolingType.PASSIVE_COOLING && temperatureInC > 40) {
        //     return new Action(Action.ActionType.ALERT_EMAIL, "the temperature is too high for passive cooling.");
        // }

        // // STEP 4: Duplicated logic for active cooling type
        // // if (coolingType == CoolingType.HI_ACTIVE_COOLING && temperatureInC > 55) {
        // //     return new Action(Action.ActionType.ALERT_EMAIL, "the temperature is too high for hi active cooling.");
        // // }
        // // Step 4 code ends -------

        // ------- STEP 3 code ends -------
        return new Action(Action.ActionType.NO_ACTION, "");
    }

// ----------- STEP 2 code ends -------
}
