package com.hcl.day3;

public class Casedemo {
  public void show(String dayName) {
    switch(dayName) {
    case "Monday" :
      System.out.println("Its day 1");
      break;
    case "Thuesday" :
      System.out.println("Its day 2");
    case "Saturday" :
      System.out.println("Its day 6");
    }
  }
  public static void main(String[] args) {
    String dayName="Monday";
    new Casedemo().show(dayName);
    }

}
