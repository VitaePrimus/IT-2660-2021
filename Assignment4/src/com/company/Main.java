package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addAtEnd("one");
        ll.addAtEnd("two");
        ll.addAtEnd("three");
        ll.addAtEnd("four");
        ll.addAtStart("null");
        ll.printList();
        System.out.println(ll.index("two"));

        System.out.println();

        ll.remove(3);
        ll.amend(2,"TWOooooo");
        ll.printList();
        System.out.println(ll.index("four"));
        System.out.println(ll.index("two"));
        System.out.println();

        ll.amend("one", "1");
        ll.printList();

        ll.remove(0);
        ll.remove(3);
        ll.printList();
    }
}
