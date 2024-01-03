package org.example.two_list;

public class MyListNode {
    public int val;
    public MyListNode next;

    public MyListNode() {
    }

    public MyListNode(int val) {
        this.val = val;
    }

    public MyListNode(int val, MyListNode next) {
        this.val = val;
        this.next = next;
    }
}

