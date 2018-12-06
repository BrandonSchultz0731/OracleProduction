/*
Brandon Schultz
5 December, 2018

This AudioPlayer class allows for the creation of an AudioPlayer object to be added
as a product.
 */

package com.company;

import com.company.ItemType;
import com.company.MultimediaControl;
import com.company.Product;
import java.util.Collections;

public class AudioPlayer extends Product implements MultimediaControl {

  /**
   * type of audio specification type of media
   */
  String audioSpecification;
  ItemType mediaType;

  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
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

  /**
   * @return ordered string of audio spec and media type
   */
  public String toString() {
    return super.toString() + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;

  }

}

