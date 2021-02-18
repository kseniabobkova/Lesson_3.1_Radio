package ru.netology.domain;

public class RadioService<currentVolume> {
    int currentRadioChannel;
    int maxChannel = 9;
    int minChannel = 0;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 100;

    public RadioService() {
    }

    public RadioService(int currentRadioChannel) {
        this.currentRadioChannel = currentRadioChannel;
    }

    public RadioService(int minVolume, int maxVolume, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioChannel() {

        return currentRadioChannel;
    }

    public void setCurrentRadioChannel(int currentRadioChannel) {
        if ((currentRadioChannel > maxChannel) || (currentRadioChannel < minChannel)) {
            return;
        } else
            this.currentRadioChannel = currentRadioChannel;
    }

    public void nextChannel() {
        if ((currentRadioChannel < maxChannel) && (currentRadioChannel >= minChannel)) {
            this.currentRadioChannel = currentRadioChannel + 1;
        } else {
            this.currentRadioChannel = 0;
        }
    }

    public void prevChannel() {
        if ((currentRadioChannel <= maxChannel) && (currentRadioChannel > minChannel)) {
            this.currentRadioChannel = currentRadioChannel - 1;
        } else {
            this.currentRadioChannel = maxChannel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume > maxVolume) || (currentVolume < minVolume)) {
            return;
        } else this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if ((currentVolume < maxVolume) && (currentVolume >= minVolume)) {
            this.currentVolume = currentVolume + 1;
        } else return;
    }

    public void minusVolume() {
        if ((currentVolume <= maxVolume) && (currentVolume > minVolume)) {
            this.currentVolume = currentVolume - 1;
        } else return;
    }

}

