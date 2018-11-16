package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ViewFileInfo {

  public static void main(String[] args) {

    try {
      FileReader fr = new FileReader("/LineTests/TestResults.txt");
      int i;
      while((i = fr.read()) != -1){
        System.out.println((char)i);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e){
      System.out.println("Cant read");
    }

  }

}
