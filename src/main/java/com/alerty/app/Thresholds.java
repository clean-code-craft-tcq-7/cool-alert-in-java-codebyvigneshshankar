package com.alerty.app;

import java.util.Map;

public final class Thresholds {
    public enum ThermalManagementType {
        THERMAL_PASSIVE,
        THERMAL_HYBRID,
        THERMAL_ACTIVE
    }

    public static double alertTemperature(ThermalManagementType type) {
        Map<ThermalManagementType, Double> thresholds = java.util.Map.of(
            // ----------- STEP 5 -----------------
            // Refactor for duplication. Deprecate old interface in favor of new one.

            // ThermalManagementType.THERMAL_PASSIVE, 40.0,
            // ThermalManagementType.THERMAL_HYBRID, 50.0,
            // ThermalManagementType.THERMAL_ACTIVE, 55.0

            // ----------- STEP 5 code ends -------
        );
        Double value = thresholds.get(type);
        if (value == null) {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
        return value;
    }
}
