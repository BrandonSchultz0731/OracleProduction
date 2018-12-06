/*
Brandon Schultz
5 December, 2018

This interface defines the methods that both AudioPlayer and MoviePlayer implement. Interfaces
are only used to define methods and must only be implemented in other classes, not inside the
interface.
 */

package com.company;

public interface MultimediaControl {

  public void play();

  public void stop();

  public void previous();

  public void next();
}
