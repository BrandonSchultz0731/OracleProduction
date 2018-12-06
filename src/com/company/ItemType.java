/*
Brandon Schultz
5 December, 2018

This is the enum class, ItemType, used to create a list of
just constants that will be used in the program
 */


package com.company;

public enum ItemType {
  //ItemType AUDIO = new ItemType("AU");
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public final String code;

  //like a constructor
  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
