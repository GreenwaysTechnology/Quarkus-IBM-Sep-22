package com.ibm.reactive;

import io.smallrye.mutiny.Multi;

public class MultiDemo {
    public static void main(String[] args) {
        Multi.createFrom()
                .items(1, 23, 33, 4, 2, 10)
                .onItem().transform(item -> item * 2) // map
                .filter(item -> item % 2 == 0) //filtering data
                .select().first(2)
                .subscribe()
                .with(data -> System.out.println("data " + data));
    }
}
