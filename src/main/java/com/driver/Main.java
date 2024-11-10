package com.driver;

public class Main {
  public static void main(String[] args) {
    
    RWOnly obj = new RWOnly();

    // // directly issignining will give error due to private data member
    // obj.name = "Irshad";

    // //try printing but give error 
    // System.out.println(obj.name);  // name is private member

    obj.setName("Irshad");
    System.out.println(obj.getName());

  }
}