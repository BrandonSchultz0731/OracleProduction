/*
Brandon Schultz
This is the Interface class, Item, used to define all the methods and
variables used in the abstract class.
 */


package com.company;

import java.util.Date;

public interface Item {

  //all fields in interfaces are final
  final String manufacturer = "OracleProduction";

  //Defining all methods used in the abstract class
  public void setProductionNumber(int p);

  void setName(String n);

  String getName();

  Date getManufacturerDate();

  int getSerialNumber(int s);

}
