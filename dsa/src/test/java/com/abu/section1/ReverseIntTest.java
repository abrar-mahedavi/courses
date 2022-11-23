package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntTest {

  @Test
  public void reverseInt() {
    ReverseInt reverse = new ReverseInt();
//    System.out.println(reverse.reverseInt(10));
    Assert.assertEquals(reverse.reverseInt(10),1);
    Assert.assertEquals(reverse.reverseInt(100),1);
    Assert.assertEquals(reverse.reverseInt(-10),-1);
    Assert.assertEquals(reverse.reverseInt(102),201);
  }
}
