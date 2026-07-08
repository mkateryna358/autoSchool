package com.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Create a List<String> list not shorter than 50 elements of different length (filling is not important).
        Add manually some empty elements ""
        Output to the console using stream():
            the length of each of the list elements.
            non-empty list items not containing the d character
            list items in alphabetical order.
         */
        List<String> list = new ArrayList<>(Arrays.asList(
                "a", "bb", "ccc", "dddd", "eeeee",
                "short", "mediumWord", "loooooongWord",
                "x", "xy", "xyz", "wxyz", "vwxyz",
                "one", "two", "three", "four", "five",
                "alpha", "beta", "gamma", "delta", "epsilon",
                "sun", "moon", "star", "planet", "galaxy",
                "coffee", "tea", "juice", "water", "soda",
                "apple", "banana", "cherry", "date", "fig",
                "grape", "melon", "kiwi", "pear", "plum",
                "notebook", "computer", "keyboard", "screen",
                "mountain", "river", "forest", "desert",
                "sky", "cloud", "rain", "snow", "storm",
                "extraordinary", "tiny", "gigantic", "minuscule"));
        list.add("");
        list.add("");
        System.out.println("Size: " + list.size());

        List<Integer> lengths = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("The length of each of the list elements: " + lengths);

        List<String> sortedWords = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("List items in alphabetical order: " + sortedWords);

        List<String> sortedList = list.stream()
                .filter(x -> !x.contains("d"))
                .filter(x -> x != null && !x.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Non-empty list items not containing the d character: " + sortedList);
    }
}
