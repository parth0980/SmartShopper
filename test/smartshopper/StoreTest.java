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
public class StoreTest {
    
    public StoreTest() {
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
     * Test of Store method, of class Store.
     */
    @Test
    public void testStore() {
        System.out.println("Store");
        Store instance = new Store();
        instance.Store();
        
    }

    /**
     * Test of timings method, of class Store.
     */
    @Test
    public void testTimings() {
        System.out.println("timings");
        double opentime = 0.0;
        double closetime = 0.0;
        Store instance = new Store();
        instance.timings(opentime, closetime);
        
    }
    
}
