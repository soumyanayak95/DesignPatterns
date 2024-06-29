package com.srn.designPatterns.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject{

    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(this.temperature, this.humidity );
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMeasurements(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}
