package com.srn.designPatterns.observer.display;

import com.srn.designPatterns.observer.Observer;
import com.srn.designPatterns.observer.WeatherData;

public class StatisticsDisplay implements Display, Observer {
    private int temp;
    private int humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("in statistic display: ");
        System.out.println("temperature: " + temp);
        System.out.println("humdity: " + humidity);
    }

    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
