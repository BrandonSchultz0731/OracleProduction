/*
Brandon Schultz
5 December, 2018

This Screen class is used to define the resolution, refresh rate, and response time. The toString
method defined in this classes in order to display the 3 variables.
 */

package com.company;

public class Screen implements ScreenSpec {
  String resolution;
  int refreshrate;
  int responsetime;

  public Screen(String resolution,int refreshrate,int responsetime){
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution(){
    return resolution;
  }
  public int getRefreshRate(){
    return refreshrate;
  }
  public int getResponseTime(){
    return responsetime;
  }
  public String toString(){
    return "Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime + "\n";
  }
}
