package com.company;

import java.util.ArrayList;
import java.util.List;

// Simple Node class to be implemented into the graph
public class Node {
    private int value;

    public Node(int value){
        this.value = value;
    }

    public int getValue() { return value; }

    public String toString() {
        return String.valueOf(value);
    }

}
