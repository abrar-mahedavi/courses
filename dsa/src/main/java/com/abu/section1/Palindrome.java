package com.abu.section1;

public class Palindrome {

  public boolean checkPalindrome(String data) {
    boolean palindrome = false;
    for (int i = 0; i < data.length() / 2; i++) {
      if (data.charAt(i) != data.charAt(data.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
