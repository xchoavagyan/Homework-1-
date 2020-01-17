package com.company;

/*
        4 Design a class TV

            channel: int
            volumeLevel: int
            on: boolean

            methods
            turnOnOrOffTheTv()

     */
public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV(int channel, int volumeLevel, boolean on) {
            this.channel = channel;
            this.volumeLevel = volumeLevel;
            this.on = on;
    }

    public TV() {
    }

    public void turnOnOrOffTheTv() {
        if (on) {
            on = false;
        } else {
            on = true;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumelevel) {
        this.volumeLevel = volumelevel;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
