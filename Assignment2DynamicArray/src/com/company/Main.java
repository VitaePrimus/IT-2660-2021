package com.company;

public class Main {

    public static void main(String[] args) {
        // Declaring array object
        CartArray cart = new CartArray(2);
        cart.insert("carrot");
        cart.insert("grapes");
        cart.insert("apple");
        cart.insert("banana");
        cart.printArray();
    }
}
