package com.buetbusexp.userservicebuetbus.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class trackGPSAddRequest {
    private String latitude;
    private String longitude;
    private String busId;

    private String time;
    private String date;



    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getBusId() {
        return busId;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
}
