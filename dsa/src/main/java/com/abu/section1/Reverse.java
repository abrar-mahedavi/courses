package com.abu.section1;

public class Reverse {

  public String reverse(String data) {
    data = data.trim();
    StringBuilder sb = new StringBuilder();
    for (Character c : data.toCharArray()) {
      sb.append(c);
    }
    return sb.toString();
  }
}
