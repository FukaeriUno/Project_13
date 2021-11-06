package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMoreThanMaxCurrentStation() {
        Radio radio = new Radio(5, 0, 10);

        radio.setCurrentStation(10);

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinCurrentStation() {

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessThanCurrentStation() {

        radio.setCurrentStation(-5);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinCurrentStation() {

        radio.setCurrentStation(0);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStation() {

        radio.setCurrentStation(5);
        radio.decreaseStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxCurrentStation() {

        radio.setCurrentStation(9);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStation() {

        radio.setCurrentStation(5);
        radio.increaseStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio(1, 2, 5);
        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMoreThan100CurrentVolume() {
        Radio radio = new Radio(0, 100, 10);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolumeLessThan0() {
        Radio radio = new Radio(0, 0, 10);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio(1, 3, 6);

        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAmountOfStations() {

        int expected = 10;
        int actual = radio.getAmountOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountOfStations() {

        radio.setAmountOfStations(5);
        int expected = 5;
        int actual = radio.getAmountOfStations();
        assertEquals(expected, actual);
    }
}