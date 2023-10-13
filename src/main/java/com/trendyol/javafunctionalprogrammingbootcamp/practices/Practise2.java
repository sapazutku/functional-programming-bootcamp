package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;
import java.util.stream.Collectors;

public class Practise2 {

    public List<String> filterByFirstCharacter(List<String> strings, char c) {
        return strings.stream().filter(string -> string.toLowerCase()
                .startsWith(String.valueOf(c)
                        .toLowerCase()))
                .collect(Collectors.toList());
    }
}
