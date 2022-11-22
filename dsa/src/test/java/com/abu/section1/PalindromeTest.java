package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

  @Test
  public void checkPalindrome() {
    Palindrome palindrome = new Palindrome();
    Assert.assertEquals(false, palindrome.checkPalindrome("dads"));
    Assert.assertEquals(true, palindrome.checkPalindrome("dad"));
    Assert.assertEquals(true, palindrome.checkPalindrome("amanaplanacanalpanama"));
  }
}
