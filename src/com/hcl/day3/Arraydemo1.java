package com.hcl.day3;

/** 
 * program for Array1..
 * @author BLTuser
 *
 */

public class Arraydemo1 {

  /**
   * main class..
   */

  public void show() {
    int[] a = new int[] {12,6,33,623,56};
    for (int i : a) {
      System.out.println(i);
    }
  }
  
  public static void main(String[] args) {
    new Arraydemo1().show();
  }
}
