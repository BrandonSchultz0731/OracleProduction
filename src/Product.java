/*
Brandon Schultz
This is the abstract class, Product, used to implement all the methods
defined in the Interface class.
 */


import com.company.Item;
import java.util.Date;

public abstract class Product implements Item {

  private int serialNumber;
  //private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private int currentProductionNumber;

  public Product(String n, int num) {
    System.out.println("test");
    name = n;
    serialNumber = currentProductionNumber++; //post-fix notation, assigns old value, then increment
    manufacturedOn = new Date();
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
