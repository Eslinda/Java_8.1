package ru.netology.domain;

import com.sun.source.tree.IfTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {


    private int currentStation;
    private int currentVolume;
    private  int maxVolume = 100;
    private int maxStation = 9;

    public Radio (int maxStation){
        this.maxStation = maxStation - 1;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        this.currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
            setCurrentStation(currentStation);
        } else {
            currentStation = currentStation + 1;
            setCurrentStation(currentStation);
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
            setCurrentStation(currentStation);
        } else {
            currentStation = currentStation - 1;
            setCurrentStation(currentStation);
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > maxVolume) {
            return ;
        }
        this.currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
            setCurrentVolume(currentVolume);
        } else {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            setCurrentVolume(currentVolume);
        } else {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);
        }
    }
}
