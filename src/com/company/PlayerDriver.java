/*
Brandon Schultz
5 December, 2018

This class's purpose is only to test the methods implemented in both the AudioPlayer and
MoviePlayer.
 */

package com.company;

public class PlayerDriver {

  public static void testPlayer(){
    MultimediaControl moviePlayer = new MoviePlayer("DBPOWER MK101",new Screen("720x480",40,22),MonitorType.LED);
    //System.out.println(moviePlayer.toString());
    MultimediaControl audioPlayer = new AudioPlayer("Audio Name","Spec");
    //System.out.println(audioPlayer.toString());
    audioPlayer.next();
    audioPlayer.play();
    audioPlayer.previous();
    audioPlayer.stop();

    moviePlayer.next();
    moviePlayer.play();
    moviePlayer.previous();
    moviePlayer.stop();
  }




}

