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

    // Used to add an item at the last position in an array
    public void add(String item){
        String[] itemsNew = new String[length + 1];         // Creates new array

        if(items.length == length){

            for(int i = 0; i < length; i++){                // Copy the old array
                itemsNew[i] = items[i];
            }

            items = itemsNew;                               // Make the new array the main one
        }

        items[length] = item;                               // Adding the item
        length++;                                           // Increasing the array size index
    }

    // Lets the user choose where to add an item and shift others to the right (was harder than I thought)
    public void add(String item, int index){
        if(index < 0 || index > length){    // Do nothing if index is incorrect
            return;
        }

        String[] itemsNew = new String[length + 1];     // Creates new array

        if(items.length == length){

            for(int i = 0; i < length; i++){
                if(i < (index - 1)) itemsNew[i] = items[i];
                else if(i > (index - 1)) itemsNew[i + 1] = items[i];
                else{
                    itemsNew[i] = item;
                    itemsNew[i + 1] = items[i];
                }
            }

            items = itemsNew;
        }

        length++;
    }

    // Replaces an existing item with a new one at a selected index
    public void replace(String item, int index){
        if(index < 0 || index > length){    // Do nothing if index is incorrect
            return;
        }

        this.items[index - 1] = item;
    }

    // Removes an item and shifts the list to the left
    public void remove(int index){
        if(index < 0 || index > length){    // Do nothing if index is incorrect
            return;
        }

        String[] itemsNew = new String[length - 1];     // Creates new array that is smaller

            for(int i = 0; i < length; i++){
                if(i < (index)) itemsNew[i] = items[i];
                else itemsNew[i - 1] = items[i];
            }

            items = itemsNew;

        length--;   // This time decreasing the index of the array size

    }

    public String getIndex(String item){        // This only returns the first occurrence of an item in hte array, if that is
        String index = "";                      // a problem, please let me know and I will try to fix it

        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase(item)){
                index = "Index of " + item + " is: #" + (i + 1);
                break;  // Ends loop after locating the first item with that name in the array
            }
            else{
                index = "There is no such item in the list.";
            }
        }

        return index;
    }
}
