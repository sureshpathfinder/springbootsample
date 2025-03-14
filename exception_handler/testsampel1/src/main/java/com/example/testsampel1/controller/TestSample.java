package com.example.testsampel1.controller;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.stream.*;
import java.util.function.*;

public class TestSample {
    //output : a
   static String str = "BalaramanB";
   public static void test() {
      Map<Character, Long> s =  str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      for(Map.Entry<Character, Long> entry: s.entrySet()) {
          if(entry.getValue() > 1)
            System.out.println(entry.getKey() + " " + entry.getValue());

      }
   }

}
