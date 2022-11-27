package com.abu.section1;

public class Capitalize {
  public String capitalizeSentence(String sentence){
    StringBuilder stringBuilder = new StringBuilder();
    for(String word: sentence.split(" ")){
      stringBuilder.append(word.substring(0, 1).toUpperCase() + word.substring(1));
      stringBuilder.append(" ");
    }
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }
}
