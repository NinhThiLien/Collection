package com.hash.hashset;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Dog> hset = new HashSet<Dog>();
        hset.add(new Dog(1));
        hset.add(new Dog(1));
        for(Dog d:hset){
            System.out.println(d.size);
        }
    }
}
