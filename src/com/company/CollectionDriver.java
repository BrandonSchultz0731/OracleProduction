/*
Brandon Schultz
5 December, 2018

This CollectionDriver class tests the combination of both AudioPlayer and MoviePlayer objects
by calling the constructor for both classes. Those objects are put into a product ArrayList and
stored as products. The products are then sorted and printed to the console.
 */

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDriver {

  public static void testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    Collections.sort(products);
    print(products);
  }

  // Step 16
  // Create print method here
  public static <T> void print(ArrayList<T> products) {
    for (T p : products) {
      System.out.println(p);
    }
  }

}
