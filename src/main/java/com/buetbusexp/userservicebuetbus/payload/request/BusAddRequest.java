package com.buetbusexp.userservicebuetbus.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.sql.Date;

public class BusAddRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String numberPlate;

    @NotBlank
    private String capacity;
    private String status;
    private String busType;
    private String routeName;
    private String driverName;
    private String conductorName;
    private Date dateofActivation;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getDriverName() {
        return driverName;
    }


    public String getConductorName() {
        return conductorName;
    }

    public void setConductorName(String conductorName) {
        this.conductorName = conductorName;
    }

    public Date getDateofActivation() {
        return dateofActivation;
    }

    public void setDateofActivation(Date dateofActivation) {
        this.dateofActivation = dateofActivation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
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
