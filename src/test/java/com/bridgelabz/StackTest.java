package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void givenStackWithThreeNumber() {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();
         Node result = stack.peek();
       Assert.assertEquals(3,stack.getSize());
    }

//    @Test
//    public void givenStackPopAllElements() {
//        Stack stack = new Stack();
//        stack.push(70);
//        stack.push(30);
//        stack.push(56);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//         stack.printStack();
//        Assert.assertEquals(0,stack.getSize());
//    }
}
