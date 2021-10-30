package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        currentStation += 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        currentStation -= 1;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume () {
        if (currentVolume < 10) {
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

}

