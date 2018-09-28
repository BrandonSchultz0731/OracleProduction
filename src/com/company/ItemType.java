package com.company;

public enum ItemType {
  //ItemType AUDIO = new ItemType("AU");
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private final String code;

  ItemType(String code){
    this.code = code;
  }
  public String getCode(){
    return code;
  }
}
