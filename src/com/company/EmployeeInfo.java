package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;


  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setDeptId();
    in.close();
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);


  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }


  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //valid, has space
      code = name.substring(0, 1) + name.substring(name.indexOf(" ") + 1);
    } else { //invalid, no space
      code = "guest";
    }

  }

  private String inputName() {
    String nameString;
    System.out.println("Please enter your first and last name");
    nameString = in.nextLine();
    return nameString;


  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  public String getDeptId() {
    System.out.println("Please enter a Dept ID");
    deptId = in.nextLine();
    if(!validId(deptId)){
      deptId = "None01";
    }
    return deptId;
  }

  public void setDeptId() {
    getDeptId();

  }

  private String getId() {
    return null;
  }

  private boolean validId(String id) {
    if (p.matcher(id).matches()) {
      deptId = reverseString(id);
      return true;
    } else {
      return false;
    }
  }

  public String reverseString(String id){
    deptId = "";
    for(int i = id.length() - 1; i >= 0; i--){
      deptId = deptId + id.charAt(i);
    }
    return deptId;
  }

  @Override
  public String toString() {
    return "(" + code + ", " + deptId + ")";
  }
}
