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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of Manager method, of class Manager.
     */
    @Test
    public void testManager() {
        System.out.println("Manager");
        Manager instance = new Manager();
        instance.Manager();
       
    }

    /**
     * Test of ItemAdd method, of class Manager.
     */
    @Test
    public void testItemAdd() {
        System.out.println("ItemAdd");
        Item item = null;
        Store sto = null;
        Manager instance = new Manager();
        boolean expResult = true;
        boolean result = instance.ItemAdd(item, sto);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ItemRemove method, of class Manager.
     */
    @Test
    public void testItemRemove() {
        System.out.println("ItemRemove");
        Item item = null;
        Store sto = null;
        Manager instance = new Manager();
        boolean expResult = true;
        boolean result = instance.ItemRemove(item, sto);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Itemupdate method, of class Manager.
     */
    @Test
    public void testItemupdate() {
        System.out.println("Itemupdate");
        Item item = null;
        Store sto = null;
        Manager instance = new Manager();
        boolean expResult = true;
        boolean result = instance.Itemupdate(item, sto);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetLayout method, of class Manager.
     */
    @Test
    public void testSetLayout() {
        System.out.println("SetLayout");
        Item it = null;
        Manager instance = new Manager();
        instance.SetLayout(it);
       
    }

    /**
     * Test of timings method, of class Manager.
     */
    @Test
    public void testTimings() {
        System.out.println("timings");
        Store sto = null;
        int opentime = 0;
        int closetime = 0;
        Manager instance = new Manager();
        boolean expResult = false;
        boolean result = instance.timings(sto, opentime, closetime);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addCategories method, of class Manager.
     */
    @Test
    public void testAddCategories() {
        System.out.println("addCategories");
        Categories cat = null;
        Store sto = null;
        Manager instance = new Manager();
        boolean expResult = false;
        boolean result = instance.addCategories(cat, sto);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeCategories method, of class Manager.
     */
    @Test
    public void testRemoveCategories() {
        System.out.println("removeCategories");
        Categories Cat = null;
        Store sto = null;
        Manager instance = new Manager();
        boolean expResult = false;
        boolean result = instance.removeCategories(Cat, sto);
        assertEquals(expResult, result);
       
    }
    
}
