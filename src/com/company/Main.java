package com.company;

import com.company.AudioPlayerDriver;
import com.company.ItemType;
import com.company.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);
  static ArrayList<Product> products = new ArrayList<>();
  static boolean start = true,start1 = true;
  static String name;
  static int choice;

  public static void main(String args[]) {


    //testProduct();
    //AudioPlayerDriver.testAudioPlayer();
//    MoviePlayerDriver.testMoviePlayer();
//    PlayerDriver.testPlayer();
    //CollectionDriver.testCollection();



    System.out.println("Welcome to my program that creates products specified by the user...\n");


    while(start1){
      System.out.println("Enter 1 to: Add a product");
      System.out.println("Enter 2 to: Display total items produced");
      System.out.println("Enter 3 to: Display collection of all items");
      System.out.println("Enter any other number to quit");
      try{
        choice = scan.nextInt();
        switch (choice){
          case 1:
            AddProduct();
            break;
          case 2:
            //display total items in array
            System.out.println("The number of products added so far is: " + products.size());
            break;
          case 3:
            //display collection of items
            CollectionDriver.print(products);
            break;
          default:
            //System.out.println("Invalid input, did not enter between 1 and 3");
            start1 = false;
        }
      }catch (Exception e){
        System.out.println("Didn't enter number, try again");
        scan.nextLine();
      }


    }



  }

  private static void AddProduct() {
    System.out.println("Please add a product name to continue");
    name = scan.next();
    System.out.println(
        "You selected the option to create a product, the name you entered will be stored");
    System.out.println("Select 1 for: Creating a MoviePlayer Product");
    System.out.println("Select 2 for: Creating an AudioPlayer Product");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        //Put Movieplayer stuff here
        CreateMoviePlayer(name);
        break;
      case 2:
        //Put audioplayer stuff here
        CreateAudioPlayer(name);
        break;
      default:
        //Stuff goes here
    }
  }

  private static void CreateAudioPlayer(String name) {
    String audioSpec;
    System.out.print("Please enter audio spec (ex. MP3,WAV...): ");
    audioSpec = scan.next();

    AudioPlayer a = new AudioPlayer(name,audioSpec);
    products.add(a);

    //CollectionDriver.print(products);
    System.out.println("AudioPlayer has been added successfully!");
    System.out.println();
  }

  private static void CreateMoviePlayer(String name) {
    String screenResolution,monitorType;
    int refreshRate,responseTime;
    System.out.print("Please enter a screen resolution (ex. 720x1080): ");
    screenResolution = scan.next();
    System.out.print("Please enter Refresh Rate: ");
    refreshRate = scan.nextInt();
    System.out.print("Please enter response time: ");
    responseTime = scan.nextInt();
    System.out.print("Please enter LED or LCD: ");
    monitorType = scan.next();

    switch (monitorType.toUpperCase()){
      case "LED":
        MoviePlayer m = new MoviePlayer(name,new Screen(screenResolution,refreshRate,responseTime),MonitorType.LED);
        products.add(m);
        break;
      case "LCD":
        MoviePlayer m1 = new MoviePlayer(name,new Screen(screenResolution,refreshRate,responseTime),MonitorType.LCD);
        products.add(m1);
        break;
        default:
          System.out.println("WHOOPS");
    }
    //CollectionDriver.print(products);
    System.out.println("MoviePlayer has been added successfully!");
    System.out.println();


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

    //ArrayList<Widget> widgets2 = new ArrayList<>();

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