/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author parth
 */
public class NumofitemsTest {
    
    public NumofitemsTest() {
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
     * Test of available method, of class Numofitems.
     */
    @Test
    public void testAvailable() {
        System.out.println("available");
        Numofitems instance = new Numofitems();
        boolean expResult = true;
        boolean result = instance.available();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of notavailable method, of class Numofitems.
     */
    @Test
    public void testNotavailable() {
        System.out.println("notavailable");
        Numofitems instance = new Numofitems();
        boolean expResult = false;
        boolean result = instance.notavailable();
        assertEquals(expResult, result);
      
    }
    
}
