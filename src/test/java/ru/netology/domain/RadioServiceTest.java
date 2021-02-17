package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {


    @Test
    public void shouldRadioChannelMin() {
        RadioService radioService = new RadioService(0);
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelMax() {
        RadioService radioService = new RadioService(9);
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelMiddle() {
        RadioService radioService = new RadioService(5);
        assertEquals(5, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelOverMax() {
        RadioService radioService = new RadioService(9);
        radioService.setCurrentRadioChannel(10);
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelOver() {
        RadioService radioService = new RadioService(9);
        radioService.setCurrentRadioChannel(5);
        assertEquals(5, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelOverMin() {
        RadioService radioService = new RadioService(0);
        radioService.setCurrentRadioChannel(-3);
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannel() {
        RadioService radioService = new RadioService();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext1() {
        RadioService radioService = new RadioService(5);
        radioService.nextChannel();
        assertEquals(6, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext2() {
        RadioService radioService = new RadioService(0);
        radioService.nextChannel();
        assertEquals(1, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext3() {
        RadioService radioService = new RadioService(9);
        radioService.nextChannel();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext4() {
        RadioService radioService = new RadioService(8);
        radioService.nextChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext5() {
        RadioService radioService = new RadioService(10);
        radioService.nextChannel();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelNext6() {
        RadioService radioService = new RadioService(-1);
        radioService.nextChannel();
        assertEquals(0, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev1() {
        RadioService radioService = new RadioService(5);
        radioService.prevChannel();
        assertEquals(4, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev2() {
        RadioService radioService = new RadioService(0);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev3() {
        RadioService radioService = new RadioService(9);
        radioService.prevChannel();
        assertEquals(8, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev4() {
        RadioService radioService = new RadioService(10);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldRadioChannelPrev5() {
        RadioService radioService = new RadioService(-1);
        radioService.prevChannel();
        assertEquals(9, radioService.getCurrentRadioChannel());
    }

    @Test
    public void shouldVolumeUp1() {
        RadioService radioService = new RadioService(0, 100, 50);
        radioService.plusVolume();
        assertEquals(51, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        RadioService radioService = new RadioService(0, 100, 0);
        radioService.plusVolume();
        assertEquals(1, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        RadioService radioService = new RadioService(0, 100, 100);
        radioService.plusVolume();
        assertEquals(100, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp4() {
        RadioService radioService = new RadioService(0, 100, -1);
        radioService.plusVolume();
        assertEquals(-1, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        RadioService radioService = new RadioService();
        radioService.minusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown1() {
        RadioService radioService = new RadioService(0, 100, 50);
        radioService.minusVolume();
        assertEquals(49, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown2() {
        RadioService radioService = new RadioService(0, 100, 0);
        radioService.minusVolume();
        assertEquals(0, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown3() {
        RadioService radioService = new RadioService(0, 100, 100);
        radioService.minusVolume();
        assertEquals(99, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown4() {
        RadioService radioService = new RadioService(0, 100, -1);
        radioService.minusVolume();
        assertEquals(-1, radioService.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown5() {
        RadioService radioService = new RadioService(0, 100, 101);
        radioService.minusVolume();
        assertEquals(101, radioService.getCurrentVolume());
    }


    @Test
    public void shouldSetCurrentVolume() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(5);
        assertEquals(5, radioService.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume2() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(101);
        assertEquals(0, radioService.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume3() {
        RadioService radioService = new RadioService();
        radioService.setCurrentVolume(-1);
        assertEquals(0, radioService.getCurrentVolume());
    }

}


