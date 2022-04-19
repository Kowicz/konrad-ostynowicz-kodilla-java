package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : this.temperatures.getTemperatures().entrySet()) {

            //adding 1 celsius degree to current value as temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }

        return resultMap;
    }

    public double calculateAverageTemperature() {

        double sum = 0d;

        for (Map.Entry<String, Double> temperature : this.temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {

        List<Double> temperatures = new ArrayList<>(this.temperatures.getTemperatures().values());
        Collections.sort(temperatures);

        if (temperatures.size() % 2 != 0) {
            return temperatures.get((temperatures.size() / 2));
        }

        Double aDouble = temperatures.get((temperatures.size() / 2) - 1);
        Double aDouble1 = temperatures.get((temperatures.size() / 2));

        return (aDouble + aDouble1) / 2;

    }

}
