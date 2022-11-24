package com.abu.section1;

public class FizzBuzz {

  public void fizzBuzz(Integer n) {
    for (int i = 1; i <= n; i++) {
      if (i % 5 == 0 && i % 3 == 0) {
        System.out.println("FIZZBUZZ");
      } else if (i % 5 == 0) {
        System.out.println("FIZZ");
      } else if (i % 3 == 0) {
        System.out.println("BUZZ");
      } else {
        System.out.println(i);
      }
    }
  }
}
