package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testPushPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());

    }


    public void testPushAndPopMixedTypes() {
        MyStack<Object> stack = new MyStack<>();
        stack.push(1);
        stack.push("two");
        stack.push(3.5);

        assertEquals(3.5, stack.pop());
        assertEquals("two", stack.pop());
        assertEquals(1, stack.pop());
    }

    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertTrue(stack.isEmpty());
//        stack.push(1);
//        assertFalse(stack.isEmpty());
//        stack.pop();
//        assertTrue(stack.isEmpty());
    }

    //    public void testPop(){
//        MyStack<Integer> stack = new MyStack<>();
//
//        assertEquals(3, stack.pop().intValue());
////        assertEquals(2, stack.pop());
////        assertEquals(1, stack.pop());
//    }

//    public void testPopEmptyStack() {
//        MyStack<Integer> stack = new MyStack<>();
//        assertThrows(EmptyStackException.class, stack::pop);
//    }

}
