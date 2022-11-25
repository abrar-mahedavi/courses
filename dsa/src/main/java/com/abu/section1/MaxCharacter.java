package com.abu.section1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MaxCharacter {

  public Character maxCharacter(String data) {
    Map<Character, Integer> characterCount = new HashMap<>();
    for (Character c : data.toCharArray()) {
      if (Objects.nonNull(characterCount.get(c))) {
        Integer integer = characterCount.get(c);
        characterCount.put(c, integer + 1);
      } else {
        characterCount.put(c, 1);
      }
    }
    int max = 0;
    Character maxCharacter = null;

    for (Map.Entry<Character, Integer> element : characterCount.entrySet()) {
      if (element.getValue() > max) {
        max = element.getValue();
        maxCharacter = element.getKey();
      }
    }
    return maxCharacter;

  }
}
