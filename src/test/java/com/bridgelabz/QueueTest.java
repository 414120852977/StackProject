package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void creatingQueueWuthThreeNodesAndPerformEnqueue() {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printqueue();
        Assert.assertEquals(3,queue.getSize());
    }

}
