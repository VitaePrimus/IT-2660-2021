package com.company;

public class Main {

    public static void main(String[] args) {
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
        stack.pop();
        stack.peek();
        stack.push("number");
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();

        stack.pop();    // Becomes empty
        stack.peek();
        stack.pop();    // Can't remove anything because IS_EMPTY
        stack.peek();

        stack.push("another string");
        stack.peek();
        stack.push("and another string");
        stack.peek();
        stack.push("and another another string");
        stack.peek();

    }
}

/*Output should read this:
one
two
three
four
three
two
number
two
one
Stack is empty.
Nothing to remove. Stack is empty.
Stack is empty.
another string
and another string
and another another string*/