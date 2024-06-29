package com.srn.designPatterns.observer;

public interface Subject {
    public void notifyObserver();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
