package com.company;

public class LLNode {
    private String item;
    private LLNode next;

    public LLNode(String item){
        this.item = item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public String getItem() {
        return item;
    }

    public LLNode getNext() {
        return next;
    }
}
