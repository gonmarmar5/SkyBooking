package com.gonmarmar.skybooking.controller;

import com.gonmarmar.skybooking.model.Flight;
import com.gonmarmar.skybooking.repository.FlightRepository;
import com.gonmarmar.skybooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightService flightService;

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/flights")
    public String listFlights(Model model) {
        List<Flight> flights = flightRepository.findAll();
        model.addAttribute("flights", flights);
        return "views/flights"; 
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }

    // Puedes agregar más endpoints según tus necesidades
}
