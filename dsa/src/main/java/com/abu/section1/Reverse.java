package com.abu.section1;

public class Reverse {

  public String reverse(String data) {
    data = data.trim();
    StringBuilder sb = new StringBuilder();
    for (int i=data.length()-1;i>=0;i--) {
      sb.append(data.charAt(i));
    }
    return sb.toString();
  }
}
