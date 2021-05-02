package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void createLinkedlistAddOneByOneToFront() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.viewlist();
        Assert.assertEquals(3, linkedList.getSize());
    }

    /**
     * appending 30 and 70 to 56
     * first 56 will be created then next appent 30 to 56 and finally append 70 to 30
     */
    @Test
    public void insertAtLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(56);
        linkedList.insertLast(30);
        linkedList.insertLast(70);
        linkedList.insertLast(70);
        linkedList.viewlist();
        Assert.assertEquals(3, linkedList.getSize());
    }

    /**
     * inset At position method work to place the element in exact position
     */
    @Test
    public void insertAtExactPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertAtPosition(30, 1);
        linkedList.insertFirst(56);
        linkedList.viewlist();
        Assert.assertEquals(3, linkedList.getSize());
    }

    /**
     * method is to delete first position of a linked list
     */
    @Test
    public void deleteFirstPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.deletefirst();
        linkedList.viewlist();
        Assert.assertEquals(2, linkedList.getSize());
    }

    /**
     * deleting list from last position
     */
    @Test
    public void deletelistfromLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.deleteLast();
        linkedList.viewlist();
        Assert.assertEquals(2, linkedList.getSize());
    }

    /**
     * finding node with 30 search node 30 and searching will be there
     */
    @Test
    public void searchNodeWithLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.searchNode(30);
        linkedList.viewlist();
        Assert.assertEquals(3, linkedList.getSize());
    }

    /**
     * insert after 30 to 40 to the linked list as sequence is 56 -> 30 ->40 ->70-null
     * first serch with node 30 and then after search put new node 40
     */

    @Test
    public void searchNodeAndPlaceValue() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.searchAndThenPlace(40, 30);
        linkedList.insertFirst(56);
        linkedList.viewlist();
        Assert.assertEquals(4, linkedList.getSize());
    }

    /**
     * delete a node from linked list at a specific position and show also size of linked list
     */
    @Test
    public void deleteSpecificNodeInLinkedList() {
        LinkedList linkedList = new LinkedList();

        linkedList.insertFirst(70);
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.searchAndThenPlace(40, 30);
        linkedList.insertFirst(56);
        linkedList.deleteNodeFromList(40);
        linkedList.viewlist();
        Assert.assertEquals(4, linkedList.getSize());
    }
    /**
     * ability to create linked list in ordered using sorting data will be in unorderd then i am performed operation to keep data
     * in ascending ordered
     */

}
