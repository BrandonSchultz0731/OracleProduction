/*
Brandon Schultz
5 December, 2018

This is the abstract class, com.company.Product, used to implement all the methods
defined in the Interface class.
 */

package com.company;

import com.company.Item;
import java.util.Date;

public abstract class Product implements Item,Comparable<Product>{

  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = 1;

  public Product(String n) {
    name = n;
    serialNumber = currentProductionNumber++; //post-fix notation, assigns old value, then increment
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
  }

  public static void staticSetProduction(int a){
    Product.currentProductionNumber = a;
  }

  public void setProductionNumber(int p) {
//    Product.currentProductionNumber = p;
    staticSetProduction(p);
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  public int getSerialNumber(int s) {
    return serialNumber;
  }

  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name + "\n";
  }

  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }
}
