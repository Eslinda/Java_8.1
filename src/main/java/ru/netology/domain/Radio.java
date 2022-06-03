package ru.netology.domain;

import com.sun.source.tree.IfTree;

public class Radio {


    private int currentStation;
    private int currentVolume;

    private  int maxVolume = 100;

    private int maxStation = 9;

    public Radio (int maxStation){
        this.maxStation = maxStation - 1;
    }

    public Radio (){

    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        this.currentStation = newStation;
    }

    public int getStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
            setStation(currentStation);
        } else {
            currentStation = currentStation + 1;
            setStation(currentStation);
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
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
        if (newVolume > maxVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
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
