package com.company;

public class MoviePlayer extends Product implements MultimediaControl {

String screen = "LCD";
String monitorType = "LED";


  MoviePlayer(String name){
    super(name);
  }
  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }


}
