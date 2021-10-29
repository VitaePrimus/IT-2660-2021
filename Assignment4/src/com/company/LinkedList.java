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

    // Changing with the index
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

    // Chenging with the value
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
        LLNode current = head;
        LLNode next = current.getNext();
        LLNode previous = head;
        int currentIndex = 0;

        while(current != null){
            if(currentIndex == index){
                if(head == tail){       // Remove if only 1 item
                    head = null;
                    tail = null;
                }
                if(current == head){    // Remove at start
                    current = null;
                    head = next;
                    //System.out.println("removed first. New first: " + next.getItem());            // Used for debugging
                }
                else if(current == tail){       // Remove at end
                    tail = previous;
                    previous.setNext(null);
                    current = null;
                    //System.out.println("removed last. Previous item: " + previous.getItem());     // Used for debugging
                }
                else {      // Remove index in the middle
                    current = next;
                    previous.setNext(next);
                    //System.out.println("Item in " + currentIndex + " position in removed.");      // Used for debugging
                }
            }

            // Advancing to the next
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
