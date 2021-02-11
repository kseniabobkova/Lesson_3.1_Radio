package ru.netology.domain;

public class RadioService {
    int currentRadioChannel;
    int currentVolume;

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public void setCurrentRadioChannel(int currentRadioChannel) {
        this.currentRadioChannel = currentRadioChannel;
    }


    public void nextChannel() {
        if ((currentRadioChannel < 9) && (currentRadioChannel >= 0)) {
            this.currentRadioChannel = currentRadioChannel + 1;
        } else if (currentRadioChannel >= 9) {
            this.currentRadioChannel = 0;
        } else {
            this.currentRadioChannel = 9;
        }
    }


    public void prevChannel() {
        if ((currentRadioChannel <= 9) && (currentRadioChannel > 0)) {
            this.currentRadioChannel = currentRadioChannel - 1;
        } else if (currentRadioChannel > 9) {
            this.currentRadioChannel = 9;
        } else {
            this.currentRadioChannel = 9;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void plusVolume() {
        if ((currentVolume < 10) && (currentVolume >= 0)) {
            this.currentVolume = currentVolume + 1;
        } else if (currentVolume >= 10) {
            return;
        } else {
            return;
        }

    }

    public void minusVolume() {
        if ((currentVolume <= 10) && (currentVolume > 0)) {
            this.currentVolume = currentVolume - 1;
        } else if (currentVolume <= 0) {
            return;
        } else {
            return;
        }

    }


}
