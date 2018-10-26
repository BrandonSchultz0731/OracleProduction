package com.company;

public class MoviePlayerDriver {

  public static void testMoviePlayer() {
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",new Screen("720x480",40,22),MonitorType.LCD);
    System.out.println(m1.toString());
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768",40,22),MonitorType.LED);
    System.out.println(m2.toString());

  }

}

