/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import java.util.ArrayList;
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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of Customer method, of class Customer.
     */
    @Test
    public void testCustomer() {
        System.out.println("Customer");
        Customer instance = new Customer();
        instance.Customer();
       
    }

    /**
     * Test of AccDetails method, of class Customer.
     */
    @Test
    public void testAccDetails() {
        System.out.println("AccDetails");
        Customer instance = new Customer();
        ArrayList expResult = null;
        ArrayList result = instance.AccDetails();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of StoreLocator method, of class Customer.
     */
    @Test
    public void testStoreLocator() {
        System.out.println("StoreLocator");
        String search = "";
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.StoreLocator(search);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removePreferredStore method, of class Customer.
     */
    @Test
    public void testRemovePreferredStore() {
        System.out.println("removePreferredStore");
        String replace = "";
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.removePreferredStore(replace);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addPreferredStore method, of class Customer.
     */
    @Test
    public void testAddPreferredStore() {
        System.out.println("addPreferredStore");
        String search = "";
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.addPreferredStore(search);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of itemavailability method, of class Customer.
     */
    @Test
    public void testItemavailability() {
        System.out.println("itemavailability");
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.itemavailability();
        assertEquals(expResult, result);
       
    }
    
}
