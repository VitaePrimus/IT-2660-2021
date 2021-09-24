package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Assignment 3 Start");

        Stack stack = new Stack(1);

        stack.push("one");
        stack.peek();
        stack.push("two");
        stack.peek();
        stack.push("three");
        stack.peek();
        stack.push("four");
        stack.peek();
        stack.pop();
        stack.peek();

    }
}
