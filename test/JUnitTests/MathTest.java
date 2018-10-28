/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palmerfam
 */
public class MathTest {
   
    public MathTest() {
        
    }

    /**
     * Test of sum method, of class Math.
     */
    @Test
    public void testSum() {
        Math add = new Math(5);
        int expected = 10;
        int actual = add.sum();
        assertEquals(expected, actual, 0.01);
    }
    
}
