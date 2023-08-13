package com.buetbusexp.userservicebuetbus.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class BusUpdateRequest {
//    @NotBlank
//    private String driverName;

    @NotBlank
    private String capacity;

    // Other attributes, getters and setters
//
//
//    public String getDriverName() {
//        return driverName;
//    }
//
//    public void setDriverName(String driverName) {
//        this.driverName = driverName;
//    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
