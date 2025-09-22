package com.alerty.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// ----------- STEP 5 -----------------
// Separation of classification from the email action.

// public class ClassificationTest {
//     @Test
//     public void testClassificationWhenOk() {
//         BatteryDataModel batteryData = new BatteryDataModel(Thresholds.ThermalManagementType.THERMAL_PASSIVE, 25);
//         BatteryClassifier.BatteryState batteryState = BatteryClassifier.classify(batteryData);
//         assertTrue(batteryState == BatteryClassifier.BatteryState.OK);
//     }
//     @Test
//     public void testClassificationWhenTooHigh() {
//         BatteryDataModel batteryData = new BatteryDataModel(Thresholds.ThermalManagementType.THERMAL_ACTIVE, 62);
//         BatteryClassifier.BatteryState batteryState = BatteryClassifier.classify(batteryData);
//         assertTrue(batteryState == BatteryClassifier.BatteryState.ALERT);
//     }
// }

// ----------- STEP 5 code ends -------
