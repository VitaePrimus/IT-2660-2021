package com.company;

public class Main {

    public static void main(String[] args) {
        // Declaring array object
        CartArray cart = new CartArray(2);

        // Adding multiple items
        cart.add("carrot");
        cart.add("grapes");
        cart.add("apple");
        cart.add("banana");
        cart.add("pear", 3);

        cart.replace("potatoes", 1);
        cart.replace("test_item", -1);  // To test if anything happens when using an incorrect index

        System.out.println(cart.getIndex("carrot"));
        System.out.println(cart.getIndex("potatoes"));

        // Testing the printing
        cart.printArray();
    }
}
