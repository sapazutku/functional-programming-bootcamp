package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practise4 {

    public List<String> orderByLength(List<String> strings, boolean decreasing) {
        // TODO: implement method that accepts list of strings and a boolean which indicates order way
        // TODO: returns them ordering by their length.

        if (decreasing){
            return strings.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        }
        else {
            return strings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        }

    }
}
