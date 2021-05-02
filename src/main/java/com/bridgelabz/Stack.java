package com.bridgelabz;

public class Stack<T extends Node>    {
    private final LinkedList LinkedList;
     int size;


    public <T> Stack() {
        this.LinkedList = new LinkedList();
        this.size =0;
    }

    public int getSize() {
        return size;
    }

    /**
     * creating stack with the help of linked list
     */
    public void  push(int val) {
        LinkedList.insertFirst(val);
    }

    public void printStack() {
        LinkedList.viewlist();
    }

    public Node peek() {
        return LinkedList.start;
    }

    public void pop() {
       LinkedList.deletefirst();
    }
}
