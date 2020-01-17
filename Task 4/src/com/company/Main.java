package com.company;

public class Main {

    public static void main(String[] args) {

        TV philips = new TV();
        philips.setChannel(1);
        philips.setVolumeLevel(10);
//        philips.setOn(true);
      philips.turnOnOrOffTheTv();
      philips.turnOnOrOffTheTv();
        System.out.println(philips.getOn());
    }
}
