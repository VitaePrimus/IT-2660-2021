package com.company;

public class CartArray {
    private String [] items;
    private int length;

    // Constructor, creating array and setting its initial size
    public CartArray(int length){
        items = new String[length];
    }

    // Looping through the array and printing it out
    public void printArray(){
        for(int i = 0; i < length; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(String item){

    }
}
