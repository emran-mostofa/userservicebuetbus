package com.buetbusexp.userservicebuetbus.controllers;

import com.buetbusexp.userservicebuetbus.models.Bus;
import com.buetbusexp.userservicebuetbus.payload.request.BusAddRequest;
import com.buetbusexp.userservicebuetbus.payload.request.BusUpdateRequest;
import com.buetbusexp.userservicebuetbus.payload.response.BusInfoResponse;
import com.buetbusexp.userservicebuetbus.payload.response.MessageResponse;
import com.buetbusexp.userservicebuetbus.repository.BusRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private BusRepository busRepository;

    @GetMapping("get/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
            public ResponseEntity<?> getBusById(@PathVariable Long id) {
        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found"));

        return ResponseEntity.ok(bus);
    }

    @PostMapping("/create")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> createBus(@Valid @RequestBody BusAddRequest busRequest) {
        Bus bus = new Bus();
        bus.setName(busRequest.getName());
        bus.setNumberPlate(busRequest.getNumberPlate());
        bus.setCapacity(busRequest.getCapacity());
        bus.setDriverName(busRequest.getDriverName());
        bus.setConductorName(busRequest.getConductorName());
        bus.setBusType(busRequest.getBusType());
        bus.setStatus(busRequest.getStatus());
        bus.setDateofActivation(busRequest.getDateofActivation());

        busRepository.save(bus);
        return ResponseEntity.ok(new MessageResponse("Bus created successfully!"));
    }


    @PutMapping("/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> updateBus(@PathVariable Long id, @RequestBody @Valid BusUpdateRequest busRequest) {
        Bus existingBus = busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found"));

//        existingBus.setDriverName(busRequest.getDriverName());
        existingBus.setCapacity(busRequest.getCapacity());

        busRepository.save(existingBus);
        return ResponseEntity.ok(new MessageResponse("Bus updated successfully!"));
    }



    @DeleteMapping("delete/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteBus(@PathVariable Long id) {
        busRepository.deleteById(id);
        return ResponseEntity.ok(new MessageResponse("Bus deleted successfully!"));
    }




}
