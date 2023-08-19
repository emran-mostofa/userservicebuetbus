package com.buetbusexp.userservicebuetbus.controllers;

import com.buetbusexp.userservicebuetbus.repository.TrackGPSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")


public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @Autowired
    private TrackGPSRepository trackGPSRepository;
    @PostMapping ("/putt-all")



    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
