package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void penultimateMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(1);
        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void penultimateMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(8);

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(1);

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(4);
        volume.nextVolume();

        int expected = 5;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.prevVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.nextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.prevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadio() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.nextVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadio() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.prevVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}

  /*  @Test
     public void maxLimitRadio () {
        Radio radio = new Radio ();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minLimitRadio () {
        Radio radio = new Radio ();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }*/


