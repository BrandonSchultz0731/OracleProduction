/*
Brandon Schultz
5 December, 2018

This MoviePlayer class allows for the creation of an MoviePlayer object to be added
as a product. Methods specific to MoviePlayers are implemented here.
 */

package com.company;

public class MoviePlayer extends Product implements MultimediaControl {

  /**
   * type of screen type of monitor
   */
  Screen screen;
  MonitorType monitorType;

  /**
   * @param name of product
   * @param screen type of screen
   * @param monitorType type of monitor
   */
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public void play() {
    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {
    System.out.println("Previous movie");
  }

  public void next() {
    System.out.println("Next movie");
  }

  /**
   * @return formated string output
   */
  public String toString() {
    return super.toString() +
        "Screen : " + screen +
        "Monitor Type : " + monitorType;
  }


}



