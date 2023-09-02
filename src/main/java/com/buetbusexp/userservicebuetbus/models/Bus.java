package com.buetbusexp.userservicebuetbus.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "buses",
    uniqueConstraints = {
                @UniqueConstraint(columnNames = "name"),
                @UniqueConstraint(columnNames = "numberPlate"),

        })
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //add a BType attribute
//    @Enumerated(EnumType.STRING)
//    @Column(length = 20)
//    private BType bType;

    @NotBlank
    @Size(max = 20)
    private String name;
    @NotBlank
    @Size(max = 20)
    private String numberPlate;
//
    private String driverName;
//    private String driverPhone;
    private String conductorName;
//    private String conductorPhone;

    @Size(max = 20)
    private String capacity;

    @Size(max = 20)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofActivation;

    private String busType;



    public Bus() {

    }


    public Bus( String name, String numberPlate, String driverName, String conductorName, String capacity, String status, Date dateofActivation, String busType) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.driverName = driverName;
        this.conductorName = conductorName;
        this.capacity = capacity;
        this.status = status;
        this.dateofActivation = dateofActivation;
        this.busType = busType;
    }

    public Bus(String name, String numberPlate, String capacity) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public BType getbType() {
//        return bType;
//    }
//
//    public void setbType(BType bType) {
//        this.bType = bType;
//    }

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

//    public String getDriverName() {
//        return driverName;
//    }
//
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setConductorName(String conductorName) {
        this.conductorName = conductorName;
    }


    public void setDateofActivation(Date dateofActivation) {
        this.dateofActivation = dateofActivation;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }
    //
//    public String getDriverPhone() {
//        return driverPhone;
//    }
//
//    public void setDriverPhone(String driverPhone) {
//        this.driverPhone = driverPhone;
//    }
//
//    public String getConductorName() {
//        return conductorName;
//    }
//
//    public void setConductorName(String conductorName) {
//        this.conductorName = conductorName;
//    }
//
//    public String getConductorPhone() {
//        return conductorPhone;
//    }
//
//    public void setConductorPhone(String conductorPhone) {
//        this.conductorPhone = conductorPhone;
//    }
//
//    public String getRouteName() {
//        return routeName;
//    }
//
//    public void setRouteName(String routeName) {
//        this.routeName = routeName;
//    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
