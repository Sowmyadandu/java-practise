package com.hcl.day3;

/**
 * program for printing elements of array..
 * @author BLTuser
 *
 */

public class Ayyardemo2 {
  /**
   * main class for program..
   */

  public void show() {
    String[] names = {"Sneha","Sai","Priyanka","Valli","rosh","deepak"};
    for (String string : names) {
      System.out.println(string);
    }
  }
  
  public static void main(String[] args) {
    new Ayyardemo2().show();
  }

}
