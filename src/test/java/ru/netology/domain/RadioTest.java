package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void RadioStation() {
        Radio radio = new Radio();
        radio.setStation(5);

        int actual = radio.getStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void StationMore() {
        Radio radio = new Radio();
        radio.setStation(10);

        int actual = radio.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void StationNegative() {
        Radio radio = new Radio();
        radio.setStation(-1);

        int actual = radio.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void NextStation() {
        Radio radio = new Radio();
        radio.setStation(5);

        radio.nextStation();

        int actual = radio.getStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void NextStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.nextStation();

        int actual = radio.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void NextStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);

        radio.nextStation();

        int actual = radio.getStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void PreviousStation() {
        Radio radio = new Radio();
        radio.setStation(5);

        radio.previousStation();

        int actual = radio.getStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void PreviousStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.previousStation();

        int actual = radio.getStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void PreviousStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);

        radio.previousStation();

        int actual = radio.getStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void Volume() {
        Radio radio = new Radio();
        radio.setVolume(7);

        int actual = radio.getVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void VolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);

        int actual = radio.getVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void VolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void VolumeMore() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void VolumeNegative() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(2);

        radio.increaseVolume();

        int actual = radio.getVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.increaseVolume();

        int actual = radio.getVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);

        radio.decreaseVolume();

        int actual = radio.getVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
