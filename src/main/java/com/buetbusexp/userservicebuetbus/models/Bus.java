package com.buetbusexp.userservicebuetbus.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "buses",
    uniqueConstraints = {
                @UniqueConstraint(columnNames = "name"),
                @UniqueConstraint(columnNames = "numberPlate"),
                @UniqueConstraint(columnNames = "driverPhone"),
                @UniqueConstraint(columnNames = "conductorPhone"),

        })
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // add other attributes
    @NotBlank
    @Size(max = 20)
    private String name;
    @NotBlank
    @Size(max = 20)
    private String numberPlate;

    private String driverName;
    private String driverPhone;
    private String conductorName;
    private String conductorPhone;
    private String routeName;
    private String capacity;
    private String status;

    //write a basic constructor
    public Bus() {

    }

}
