package com.abu.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {

  @Test
  public void checkAnagrams() {
    Anagrams anagrams = new Anagrams();
    Assert.assertTrue(anagrams.checkAnagrams("rail safety", "fairy tales"));
    Assert.assertTrue(anagrams.checkAnagrams("rail safety", "FAIRY TALES"));
    Assert.assertTrue(anagrams.checkAnagrams("rail! safety!", "FAIRY TALES"));
  }
}
