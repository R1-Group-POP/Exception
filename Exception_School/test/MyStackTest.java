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
     * Test of push method, of class MyStack.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        int i = 5;
        MyStack instance = new MyStack();
        instance.push(i);
    }

    /**
     * Test of pop method, of class MyStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        MyStack instance = new MyStack();
        int expResult = 5;
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
    }
}
