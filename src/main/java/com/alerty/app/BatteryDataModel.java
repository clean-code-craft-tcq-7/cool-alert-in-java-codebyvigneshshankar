package com.alerty.app;

class BatteryDataModel {
    public Thresholds.ThermalManagementType thermalManagementType;
    public double temperature;

    public BatteryDataModel(Thresholds.ThermalManagementType thermalManagementType, double temperature) {
        this.thermalManagementType = thermalManagementType;
        this.temperature = temperature;
    }
}