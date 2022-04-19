package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @DisplayName("Tests a collection with uneven number of elements")
    @Nested
    class TestUnevenCollection {

        @Mock
        private Temperatures temperaturesMock;

        @BeforeEach
        public void beforeEach() {
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(this.temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        }


        @Test
        void testCalculateForecastWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }

        @Test
        void testCalculateAverageTemperaturesWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);

            //When
            double averageTemperature = weatherForecast.calculateAverageTemperature();

            //Then
            Assertions.assertEquals(25.56, averageTemperature);
        }

        @Test
        void calculateMedianTemperaturesWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);

            //When
            double medianTemperature = weatherForecast.calculateMedianTemperature();

            //Then
            Assertions.assertEquals(25.5, medianTemperature);
        }

    }



    //parity of elements influence a way in which a median is calculated,
    //to make sure both cases are tested, the following class has been created
    @DisplayName("Tests a collection with even number of elements.")
    @Nested
    class TestEvenCollection {

        @Mock
        private Temperatures temperaturesMock;

        @BeforeEach
        public void beforeEach() {
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            temperaturesMap.put("Walbrzych", 27.0);
            when(this.temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        }

        @Test
        void calculateMedianTemperaturesWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);

            //When
            double medianTemperature = weatherForecast.calculateMedianTemperature();

            //Then
            Assertions.assertEquals(25.8, medianTemperature);
        }


    }

}
