package com.srn.designPatterns.observer;

import com.srn.designPatterns.observer.display.CurrentWeatherDisplay;
import com.srn.designPatterns.observer.display.StatisticsDisplay;

public class ObserverClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay currentDisplay = new CurrentWeatherDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


        weatherData.setMeasurements(80, 65);
        weatherData.setMeasurements(82, 70);
        weatherData.setMeasurements(78, 90);
    }
}
