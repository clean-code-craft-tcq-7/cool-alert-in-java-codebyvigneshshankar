package com.alerty.app;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

// ----------- STEP 6 code starts -------
// Test the interface using stub implementation

// class ActuatorsStub implements Actuators {
//     public String to;
//     public String subject;
//     public String body;
//     public String from;
//     @Override
//     public void sendEmail(String to, String subject, String body, String from) {
//         this.to = to;
//         this.subject = subject;
//         this.body = body;
//         this.from = from;
//     }
// }

// public class ChainTest {
//     @Test
//     public void testBatteryDataToAction() {
//         BatteryDataModel batteryData = new BatteryDataModel(Thresholds.ThermalManagementType.THERMAL_ACTIVE, 70);
//         ActuatorsStub actuators = new ActuatorsStub();
//         Chain.batteryDataToAction(batteryData, actuators);
//         assertSame("manager@battery.com", actuators.to);
//         assertSame("Battery Alert", actuators.subject);
//         assertSame("Battery temperature is too high", actuators.body);
//         assertSame("noreply@battery.com", actuators.from);
//     }
// }

// ----------- STEP 6 code ends -------
