package com.company;

public class Screen implements ScreenSpec {
  String resolution;
  int refreshrate;
  int responsetime;

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
    return "Resolution  : " + resolution + "\n"
        + "Refresh Rate  : " + refreshrate + "\n"
        + "Response Time           : " + responsetime + "\n";
  }
}
