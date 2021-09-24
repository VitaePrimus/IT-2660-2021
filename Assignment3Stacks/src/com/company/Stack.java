package com.company;

public class Stack {
    private String[] string;
    private int size;           // To keep track of an array size

    public Stack(int size){
        string = new String[size];      // Initializing stack with preferred length;
    }

    // Push to add to the "top"
    public void push(String string){

        if(IS_FULL()){
            String[] newString = new String[size + 1];

            for(int i = 0; i < size; i++){
                newString[i] = this.string[i];      // Copy data to a new array when old is full
            }

            this.string = newString;
        }

        this.string[size] = string;     // Add item
        size++;
    }

    // Pop to remove from the "top"
    public void pop(){
        if(IS_EMPTY()){
            System.out.println("Nothing to remove. Stack is empty.");
            return;     // Do nothin, just return the message if empty
        }

        String[] newString = new String[size - 1];      // New smaller array

        for(int i = 0; i < (size - 1); i++){
            newString[i] = this.string[i];
        }

        this.string = newString;
        size--;
    }

    // Looking at the top element
    public void peek(){
        if(IS_EMPTY()){
            System.out.println("Stack is empty.");
            return;     // Return only the message if empty
        }
        System.out.println(this.string[size - 1]);
    }

    // Nice to have
    public Boolean IS_FULL(){
        boolean IS_FULL;

        IS_FULL = this.string.length == size;

        return IS_FULL;
    }

    // This helps
    public Boolean IS_EMPTY(){
        boolean IS_EMPTY;

        IS_EMPTY = this.string.length <=0;

        return IS_EMPTY;
    }



//    Not needed for stacks, left for testing
//    public void print(){
//        for(int i = 0; i < size; i++){
//            System.out.println("#" + (i + 1) + ": " + this.string[i]);
//        }
//    }
}
