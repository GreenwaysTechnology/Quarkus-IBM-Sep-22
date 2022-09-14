package com.ibm.reactive;

import io.smallrye.mutiny.Uni;

public class HelloWorld {
    public static void main(String[] args) {
        //uni returns /streams single item
        //create a stream, emit data,process data,subscribe
        //create a Stream - Uni.createFrom
        //emit data - item()
        //process emited data- onitem().process api- transform api
        //read data/ - subscribe().with
        Uni.createFrom().item("Hello")
                .onItem().transform(item -> item.toUpperCase())
                .onItem().transform(item -> item + "Mutiny")
                .subscribe()
                .with(data -> System.out.println(data), err -> {
                    System.out.println(err);
                });
    }
}
