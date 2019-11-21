package com.hcl.day3;
/**
 * program for sum of two numbers..
 * @author BLTuser
 *
 */

public class CalcDemo {
  public void sum(int a,int b) {
    int c = a + b;
    System.out.println("sum is  " + c);
  }
  /**
   * main method..
   * @param args custom arguments..
   */
  
  public static void main(String[] args) {
    int a;
    int b;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    CalcDemo obj = new CalcDemo();
    obj.sum(a, b);
  }
}
