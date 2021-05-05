package com.bridgelabz;

public class Node<T> {
    int data;
    Node<T> next;

    public Node() {
        this.data = 0;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
