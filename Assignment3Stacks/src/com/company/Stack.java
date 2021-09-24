package com.company;

public class Stack {
    private String[] string;
    private int size;

    public Stack(int size){
        string = new String[size];
    }

    public void push(String string){
        String[] newString = new String[size + 1];

        if(this.string.length == size){
            for(int i = 0; i < size; i++){
                newString[i] = this.string[i];
            }

            this.string = newString;
        }

        this.string[size] = string;
        size++;
    }

    public void pop(){
        String[] newString = new String[size - 1];

        if(this.string.length == size){
            for(int i = 0; i < (size - 1); i++){
                newString[i] = this.string[i];
            }

            this.string = newString;
        }

        size--;

    }

    public void peek(){
        System.out.println(this.string[size - 1]);

    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println("#" + (i + 1) + ": " + this.string[i]);
        }
    }
}
