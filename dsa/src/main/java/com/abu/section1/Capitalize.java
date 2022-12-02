package com.abu.section1;

public class Capitalize {

  public String capitalizeSentenceVersion2(String sentence){
    StringBuilder stringBuilder = new StringBuilder();
    sentence = sentence.trim();
    stringBuilder.append(sentence.substring(0,1).toUpperCase());
    for(int i =1;i<sentence.length();i++){
      if(sentence.charAt(i-1) == ' '){
        stringBuilder.append(sentence.substring(i,i+1).toUpperCase());
      } else {
        stringBuilder.append(sentence.charAt(i)+"");
      }
    }
    return stringBuilder.toString();
  }
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
