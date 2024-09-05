package com.semanticsquare.oop.interfacedemo;

import java.util.*;
public class TestClient {
   public static int getVal() {
       return 42;
   }
 
   public static void main(String[] args) {
       // Interfaces demo
       C c = new X();
      // B b = new X();
	   /*c.foo();
	   c.bar();
	   c.foobar();*/
	   
	   // Clone demo
	   /*C clone = ((X)c).clone();
	   if (clone != c) {
	      System.out.println("Clone created!!");
	   }*/
	   
	   // default method demo
       //c.go();
       //b.go();
       
       //new TestClient().lambdaTest(() -> System.out.println("Java In-Depth"));
       
       //C.staticMethod();
       ( (X) c).inheritanceTest();
   }
   void lambdaTest(FunctionalInterface fi) {
	   fi.test();
   }
}

