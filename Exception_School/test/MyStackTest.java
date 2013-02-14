/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 *
 * @author Patrick
 */
public class MyStackTest {
    
    public MyStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method exception, of class MyStack.
     */
    @Test (expected=StackIsFullException.class)
    public void testPush_Exception() throws Exception {
        System.out.println("push exception");
        System.out.println("Pusing 3 times");
        int i = 5;
        MyStack instance = new MyStack();
        
        instance.push(i);
        instance.push(i);
        instance.push(i);
    }
    
    /**
     * Test of push method, of class MyStack.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        System.out.println("Pusing 2 times");
        int i = 5;
        MyStack instance = new MyStack();
        
        instance.push(i);
        instance.push(i);
    }

    /**
     * Test of pop method exception, of class MyStack.
     */
    @Test (expected=StackIsEmptyException.class)
    public void testPop_Exception() throws Exception {
        System.out.println("pop exception");
        System.out.println("Popping one time");
        MyStack instance = new MyStack();
        
        instance.pop();
    }
    
    /**
     * Test of pop method, of class MyStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        System.out.println("Popping one time");
        MyStack instance = new MyStack();
        instance.push(5);
        instance.pop();
    }
}
