package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {

    @Test
    public void shouldRadioChannelNext1() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(5);
        radioService.nextChannel();
        assertEquals(6, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext2() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(0);
        radioService.nextChannel();
        assertEquals(1, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext3() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(9);
        radioService.nextChannel();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext4() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(20);
        radioService.nextChannel();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext5() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(-20);
        radioService.nextChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev1() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(5);
        radioService.prevChannel();
        assertEquals(4, radioService.getCurrentRadioChannel());
    }
    @Test
    public void shouldRadioChannelPrev2() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(0);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }
    @Test
    public void shouldRadioChannelPrev3() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(9);
        radioService.prevChannel();
        assertEquals(8, radioService.getCurrentRadioChannel());
    }
    @Test
    public void shouldRadioChannelPrev4() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(20);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }
    @Test
    public void shouldRadioChannelPrev5() {
        RadioService radioService = new RadioService();
        radioService.setCurrentRadioChannel(-20);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }
    @Test
    public void shouldVolumeUp1() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(5);
        radioService.plusVolume();
        assertEquals(6, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeUp2() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(0);
        radioService.plusVolume();
        assertEquals(1, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeUp3() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(10);
        radioService.plusVolume();
        assertEquals(10, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeUp4() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(20);
        radioService.plusVolume();
        assertEquals(10, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeUp5() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(-20);
        radioService.plusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown() {
        RadioService radioService = new RadioService();
        radioService.minusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown1() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(5);
        radioService.minusVolume();
        assertEquals(4, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown2() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(0);
        radioService.minusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown3() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(10);
        radioService.minusVolume();
        assertEquals(9, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown4() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(20);
        radioService.minusVolume();
        assertEquals(10, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown5() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(-20);
        radioService.minusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }
    @Test
    public void shouldVolumeDown6() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(-20);
        assertEquals(-20, radioService.getCurrentVolume());
    }
}


