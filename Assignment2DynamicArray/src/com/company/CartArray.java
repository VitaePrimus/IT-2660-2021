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
            System.out.println("#" + (i + 1) + ": " + items[i]);
        }
    }

    public void insert(String item){
        if(items.length == length){
            String[] itemsNew = new String[length + 1];     // Creates new array

            for(int i = 0; i < length; i++){                // Copy the old array
                itemsNew[i] = items[i];
            }

            items = itemsNew;                               // Make the new array the main one
        }

        items[length] = item;                               // Adding the item
        length++;
    }
}
