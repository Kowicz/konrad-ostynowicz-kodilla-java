package com.kodilla.exception.test;

public class AirTrafficMain {

    public static void main(String[] args) {

        AirTrafficController controller = new AirTrafficController();
        Flight flight = new Flight("Radom", "Gdynia");

        try {
            controller.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Requested route is not possible.");
        }

    }
}
