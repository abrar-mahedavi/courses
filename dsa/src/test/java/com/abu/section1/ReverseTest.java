package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

  @Test
  public void reverse() {
    Reverse solution = new Reverse();
    Assert.assertEquals(solution.reverse("dad"), "dad");
  }
}
