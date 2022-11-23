package com.abu.section1;

public class ReverseInt {

  public int reverseInt(int data) {
    String s = String.valueOf(data);
    Reverse reverse = new Reverse();
    String reverseInt;
    if (s.contains("-")) {
      reverseInt = reverse.reverse(s.substring(1));
    } else {
      reverseInt = reverse.reverse(s);
    }
    if (data < 0) {
      return Integer.parseInt(String.valueOf(reverseInt)) * -1;
    }
    return Integer.parseInt(String.valueOf(reverseInt));
  }
}
