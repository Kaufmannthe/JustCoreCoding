package org.coding;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsCounting {

    public static Map<String, Integer> vowelsFinder(String string) {
        Map<String, Integer> resultList = new HashMap<>();
        List<String> stringList = new ArrayList<>(Arrays.asList(string.split(" ")));
        Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
        int value = 0;
        for (String s : stringList) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                value++;
            }
            resultList.put(s, value);
            value = 0;
        }
        return resultList;
    }

    public static void mapSorting(Map<String, Integer> map) {
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> -o1.compareTo(o2)))
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        mapSorting(vowelsFinder("Write a function (and write its code in the answer)" +
                "that takes n words as input and returns a sentence in which these words are sorted by" +
                " the number of vowels. (You can use any programming language). " +
                "What is the complexity of your solution?"));
    }
}