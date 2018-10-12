package com.company;

public class MoviePlayerDriver {

  public static void main(String[] args) {
    MoviePlayer m1 = new MoviePlayer("Brandon");
    System.out.println(m1.toString());
    AudioPlayer a1 = new AudioPlayer("Testing","Good");
    System.out.println(a1.toString());

  }

}
