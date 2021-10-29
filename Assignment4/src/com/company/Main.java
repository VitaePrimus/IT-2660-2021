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
        ll.printList();

        ll.add(1, "random");
        ll.add(1,"random before random");
        ll.add(0, "new head");
        ll.add(ll.index("four"), "new tail");
        ll.printList();
    }
}
