/*
Brandon Schultz
5 December, 2018

This AudioPlayerDriver class allows the programmer to test the AudioPlayer class and testing
to make sure methods are working properly.
 */

package com.company;

public class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    a1.play();
    a1.stop();
    a1.next();
    a1.previous();
    System.out.println(a1.toString());
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(a2.toString());
  }

}
