package com.kodilla.exception.test;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AirTrafficController {
    private final Map<String, Boolean> possibleDestinations = new HashMap<>();

    public AirTrafficController() {
        this.possibleDestinations.put("Wroclaw", true);
        this.possibleDestinations.put("Warsaw", true);
        this.possibleDestinations.put("Beijing", false);
        this.possibleDestinations.put("Berlin", true);
        this.possibleDestinations.put("Paris", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();

        Optional<Map.Entry<String, Boolean>> optionalRoute = this.possibleDestinations.entrySet().stream()
                .filter(e -> e.getKey().equals(arrivalAirport))
                .filter(e -> e.getValue().equals(true))
                .findAny();

        if (optionalRoute.isPresent()) {
            System.out.println("Flight to " + arrivalAirport + " is possible.");
        } else {
            throw new RouteNotFoundException("Requested does not figure in the database.");
        }
    }
}
