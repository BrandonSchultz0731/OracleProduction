package com.company;

public class ScreenDriver {

  public static void main(String[] args) {
    Screen s1 = new Screen();
    s1.responsetime = 12;
    s1.refreshrate = 10;
    s1.resolution = "1080 x 1420";
    System.out.println(s1.toString());
  }
}
