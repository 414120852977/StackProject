package com.bridgelabz;

public class Queue {
    private final LinkedList LinkedList;
    private final int size;

    public Queue() {
        this.LinkedList = new LinkedList();
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int val) {
    LinkedList.insertLast(val);
    }

    public void printqueue() {
        LinkedList.viewlist();
    }
}
