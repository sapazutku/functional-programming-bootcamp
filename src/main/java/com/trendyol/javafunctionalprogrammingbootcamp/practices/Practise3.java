package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise3 {

    public int sumsSquares(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number)
                .reduce(0,(subtotal, element) -> subtotal + element);
    }
}
