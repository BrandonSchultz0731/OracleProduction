/*
Brandon Schultz
5 December, 2018

This is the abstract class, com.company.Product, used to implement all the methods
defined in the Interface class.
 */

package com.company;

import com.company.Item;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  /**
   * Serial number of product product manufacturer date manufactured on name of product current
   * production number
   */
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = 1;

  /**
   * @param n name of product
   */
  public Product(String n) {
    name = n;
    serialNumber = currentProductionNumber++; //post-fix notation, assigns old value, then increment
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
  }

  /**
   * @param a current production number
   */
  public static void staticSetProduction(int a) {
    Product.currentProductionNumber = a;
  }

  /**
   * @param p current production number
   */
  //This is non static method calling a static method with a static variable
  public void setProductionNumber(int p) {
//    Product.currentProductionNumber = p;
    staticSetProduction(p);
  }

  /**
   * @param n name of product
   */
  public void setName(String n) {
    name = n;
  }

  /**
   * @return name of product
   */
  public String getName() {
    return name;
  }

  /**
   * @return date product is produced
   */
  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  /**
   * @param s serial number of product
   * @return serial number of product
   */
  public int getSerialNumber(int s) {
    return serialNumber;
  }

  /**
   * @return formatted string output
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name + "\n";
  }

  /**
   * @param o Product type
   * @return compared product
   */
  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }
}
