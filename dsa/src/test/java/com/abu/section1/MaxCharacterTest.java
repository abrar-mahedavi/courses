package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCharacterTest {

  @Test
  public void maxCharacter() {
    MaxCharacter maxCharacter = new MaxCharacter();
    Assert.assertTrue(maxCharacter.maxCharacter("aaabbccccccccee") == 'c');
    Assert.assertTrue(maxCharacter.maxCharacter("abcdefghijklmnaaaaa'") == 'a');
  }
}
