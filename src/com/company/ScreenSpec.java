/*
Brandon Schultz
5 December, 2018

This ScreenSpec interface is used to define the methods that will be used in the Screen class.
 */

package com.company;

public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();
}
