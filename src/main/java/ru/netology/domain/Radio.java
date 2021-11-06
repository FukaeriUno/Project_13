package ru.netology.domain;

public class Radio {
    private int currentStation = 9;
    private int currentVolume = 100;
    private int amountOfStations = 10;

    public Radio(int currentStation, int currentVolume, int amountOfStations) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.amountOfStations = amountOfStations;
    }

    public Radio() {
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > amountOfStations - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        currentStation += 1;
        if (currentStation > amountOfStations - 1) {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        currentStation -= 1;
        if (currentStation < 0) {
            currentStation = amountOfStations - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume () {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume () {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public int getCurrentVolume () {
        return currentVolume;
    }

    public int getAmountOfStations() {
        return amountOfStations;
    }

    public void setAmountOfStations(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }
}

