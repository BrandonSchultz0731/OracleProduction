package com.company;/*
Brandon Schultz
This is the abstract class, com.company.Product, used to implement all the methods
defined in the Interface class.
 */



import java.util.Date;

public abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber;

  public Product(String n) {
    System.out.println("test");
    name = n;
    serialNumber = currentProductionNumber++; //post-fix notation, assigns old value, then increment
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
  }

  public void setProductionNumber(int p) {
    currentProductionNumber = p;
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
    return "Manufacturer  : " + manufacturer + "\n"
        + "Serial Number  : " + serialNumber + "\n"
        + "Date           : " + manufacturedOn + "\n"
        + "Name           : " + name;
  }
}
