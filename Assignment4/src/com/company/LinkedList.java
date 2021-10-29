package com.company;

public class LinkedList {
    private LLNode head;
    private LLNode tail;

    public void addAtEnd(String item){
        LLNode node = new LLNode(item);

        if (head == null){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);     // Setting Last tail item as last node
            tail = node;
        }
    }

    public void addAtStart(String item){
        LLNode node = new LLNode(item);

        if (head == null){
            head = node;
            tail = node;
        }
        else{
            node.setNext(head);     // Setting first node
            head = node;
        }
    }

    public int index(String item){
        int index = 0;
        LLNode current = head;
        while(current != null){
            if(current.getItem() == item){
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public void amend(int index, String item){
        int currentIndex = 0;
        LLNode current = head;
        while(current != null){
            if(currentIndex == index){
                current.setItem(item);
            }
            current = current.getNext();
            currentIndex++;
        }
    }

    public void amend(String oldItem, String item){
        LLNode current = head;
        while(current != null){
            if(oldItem == current.getItem()){
                current.setItem(item);
            }
            current = current.getNext();
        }
    }

    public void remove(int index){
        int currentIndex = 0;
        LLNode current = head;
        LLNode next = current.getNext();
        LLNode previous = head;

        while(current != null){
            if(currentIndex == index){
                if(current == previous){
                    head = null;
                    tail = null;
                }
                else if(current == head){
                    current.setNext(null);
                    current = next;
                    System.out.println("removed first. New first: " + next.getItem());
                }
                else if(current == tail){
                    previous.setNext(null);
                    current = null;
                    System.out.println("removed last. Previous item: " + previous.getItem());
                }
                else {
                    current = next;
                    previous.setNext(next);
                    System.out.println("Item in " + currentIndex + " position in removed.");
                }
            }

            else {
                previous = current;
                current = current.getNext();
                if (current != null && current != tail) {
                    next = current.getNext();
                }
            }
            currentIndex++;
        }
    }

    public void printList(){
        LLNode current = head;
        while(current != null) {
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }
}
