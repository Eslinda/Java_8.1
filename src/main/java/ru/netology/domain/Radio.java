package ru.netology.domain;

import com.sun.source.tree.IfTree;

public class Radio {


    private int currentStation;
    private int currentVolume;

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        this.currentStation = newStation;
    }

    public int getStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            setStation(currentStation);
        } else {
            currentStation = currentStation + 1;
            setStation(currentStation);
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = 9;
            setStation(currentStation);
        } else {
            currentStation = currentStation - 1;
            setStation(currentStation);
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            currentVolume = 10;
            setVolume(currentVolume);
        } else {
            currentVolume = currentVolume + 1;
            setVolume(currentVolume);
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            setVolume(currentVolume);
        } else {
            currentVolume = currentVolume - 1;
            setVolume(currentVolume);
        }
    }
}
