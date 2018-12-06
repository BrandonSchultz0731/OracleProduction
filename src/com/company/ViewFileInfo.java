/*
Brandon Schultz
5 December, 2018

This ViewFileInfo class can read a text file to retrieve information that is written to the
designated text file.
 */

package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ViewFileInfo {

  public static void main(String[] args) {

    try {
      //FileReader fr = new FileReader("/Users/brandonschultz/LineTests/TestResults.txt");
      InputStream inputStream = new FileInputStream(
          "/Users/brandonschultz/LineTests/TestResults.txt");
      Reader fr = new InputStreamReader(inputStream, "UTF-8");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("Cant read");
    }

  }

}
