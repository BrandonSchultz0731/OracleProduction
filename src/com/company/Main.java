package com.company;

import com.company.AudioPlayerDriver;
import com.company.ItemType;
import com.company.Product;
import java.util.ArrayList;

public class Main {

  public static void main(String args[]) {

    //testProduct();
    //AudioPlayerDriver.testAudioPlayer();
//    MoviePlayerDriver.testMoviePlayer();
//    PlayerDriver.testPlayer();
    CollectionDriver.testCollection();
  }

  public static void testProduct() {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    ArrayList<Widget> widgets = new ArrayList<>();
    widgets.add(w1);
    widgets.add(new Widget("in add"));
    widgets.add(new Widget("in add2"));

    for (Widget w : widgets) {
      System.out.println(w.toString());
    }

    ArrayList<Widget> widgets2 = new ArrayList<>();

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }

  }

}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

}