package com.abu.section1;

import java.util.*;

public class Anagrams {

  public boolean checkAnagrams(String originalWord, String anagramWord) {
    Map<Character, Integer> originalLetterCount = getLetterCount(originalWord);
    Map<Character, Integer> anagramLetterCount = getLetterCount(anagramWord);
    if (originalLetterCount.size() != anagramLetterCount.size()) {
      return false;
    } else {
//     Set<Map.Entry<Character, Integer>> entries = originalLetterCount.entrySet();
      for (Map.Entry<Character, Integer> entry : originalLetterCount.entrySet()) {
        if (originalLetterCount.get(entry.getKey()) != anagramLetterCount.get(entry.getKey())) {
          return false;
        }
      }
      for (Map.Entry<Character, Integer> entry : anagramLetterCount.entrySet()) {
        if (originalLetterCount.get(entry.getKey()) != anagramLetterCount.get(entry.getKey())) {
          return false;
        }
      }
      return true;
    }
  }

  private Map<Character, Integer> getLetterCount(String originalWord) {
    originalWord = originalWord.trim().toLowerCase();
    Map<Character, Integer> letterCount = new HashMap<>();
    for (Character c : originalWord.toCharArray()) {
      if (!(c >= 'a' && c <= 'z')){
        continue;
      }
      if (Objects.nonNull(letterCount.get(c))) {
        Integer count = letterCount.get(c) + 1;
        letterCount.put(c, count);
      } else {
        letterCount.put(c, 1);
      }
    }
    return letterCount;
  }

}
