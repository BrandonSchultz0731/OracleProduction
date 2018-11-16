package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  private Path p,p2,p3;

  public ProcessFiles(EmployeeInfo e,ArrayList<Product> pr){
    p = Paths.get("/Users/brandonschultz/LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
    try{
      WriteFile(e);
      WriteFile(pr);
    } catch (IOException e1){
      e1.printStackTrace();
    }

  }

  private void CreateDirectory(){
    if(Files.notExists(p)){
      try {
        Files.createDirectories(p);
        System.out.println("Directory Created");
      } catch (IOException e) {
        System.out.println("Can't Create Directory");
      }
    }
  }
  public void WriteFile(EmployeeInfo emp) throws IOException {

//    p2 = Paths.get(p.toUri() + "TestResults.txt");
//    Files.write(p2,emp.toString().getBytes());

    FileWriter  writer = new FileWriter(p3.toString(),true);
    PrintWriter printWriter = new PrintWriter(writer);


    printWriter.println(emp.toString());

    printWriter.close();
  }
  public void WriteFile(ArrayList<Product> products) throws IOException {
//    p2 = Paths.get(p.toUri() + "TestResults.txt");
//    Files.write(p2,products.toString().getBytes());

    FileWriter  writer = new FileWriter(p3.toString(),true);
    PrintWriter printWriter = new PrintWriter(writer);


    printWriter.println(products.toString());

    printWriter.close();
  }

}
