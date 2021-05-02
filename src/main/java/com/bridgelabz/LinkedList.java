package com.bridgelabz;

public class LinkedList<T extends  Node> {
    int size;
    Node  start;

    public <T> LinkedList() {
        this.size = 0;
        this.start = null;
    }

    public int getSize() {
        return size;
    }


    /**
     * insert node at beigining 30 qnd 56 to 70
     *
     * @return
     */
//    public static<K extends Comparable<K>> void inserBegining(int val) {
//        Node n;
//        n = new Node();
//        n.getData(val);
//        n.setNext(start);
//        start = n;
//        size++;
//    }
    public boolean isEmpty() {
        if (start == null) {
            return true;
        } else
            return false;
    }

    public void viewlist() {
        Node t;
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            t = start;
            for (int i = 0; i <= size; i++) {
                System.out.print(t.getData() + "  ->  ");
                t = t.getNext();
            }
        }
    }

    public void insertFirst(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }

    public void insertLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start;
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(n);
            size++;
        }
    }

    public void insertAtPosition(int val,int pos){
        if (pos == 1){
            insertFirst(val);
        }
        else if(pos == size+1){
            insertLast(val);
        }else if(pos>1 && pos<size){
            Node n,t;
            n=new Node();
            n.setData(val);
            n.setNext(null);
            t=start;
            for(int i=1;i<=pos;i++) {
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        }
    }

    public void deletefirst() {
        if(start == null) {
            System.out.println("list is empty");
        }
        else {
            start =start.getNext();
            size--;
        }
    }

    public void deleteLast(){
        if (start == null){
            System.out.println("empty");
        }
        else if(size == 1){
            start=null;
            size--;
        }else{
            Node t;
            t=start;
            for(int i=1;i<size-1;i++)
                t=t.getNext();
            t.setNext(null);
            size--;
        }
    }

    public void searchNode(int val) {
        Node n,t;
        t = start;
        int i = 0;
        if(start == null) {
            System.out.println("list is empty");
        }
        if(val == size-1) {
            System.out.println("found"+val);
        }
        else
            while(t.getNext() != null) {
                if(t.getData() == val) {
                    System.out.println("value found");
                    System.out.println("data -> "+val+"at"+i);
                    break;
                }
                i++;
                t = t.getNext();
            }
        }
        public  void searchAndThenPlace(int val,int Key) {
        Node n,t;
        t = start;
        int i = 0;
        if(start == null ) {
            System.out.println("list is empty");
        }
       else {
           while(t.getNext() != null) {
               if(t.getData() == Key) {
                   System.out.println("data with "+Key+"found");
                   n = new Node();
                   n.setData(val);
                   t.setNext(n);
               }
               i++;
               t = t.getNext();
           }
        }
    }

    public void  deleteNodeFromList(int val) {
        Node n,t;
        t = start;
        int i = 0;
        if(start == null) {
            System.out.println("list is empty");
        }
        else {
            while(t.getNext() != null) {
                if (t.getData() == val) {
                size--;
                    System.out.println("list");
                    break;
                }
            }
            i++;
            t = t.getNext();
        }
    }

}




