package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeTest {

  @Test
  public void capitalizeSentence() {
    Capitalize capitalize = new Capitalize();
    Assert.assertEquals("A Buddy Let, !here",capitalize.capitalizeSentence("a buddy let, !here"));
    Assert.assertEquals("A Buddy Let, !here",capitalize.capitalizeSentence("a Buddy Let, !here"));
  }
}
