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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of Administrator method, of class Administrator.
     */
    @Test
    public void testAdministrator() {
        System.out.println("Administrator");
        Administrator admin = new Administrator();
       
    }

    /**
     * Test of ItemAdd method, of class Administrator.
     */
    @Test
    public void testItemAdd() {
        System.out.println("ItemAdd");
        Item item = null;
        Store sto = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.ItemAdd(item, sto);
         System.out.print(" \n  "+result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ItemRemove method, of class Administrator.
     */
    @Test
    public void testItemRemove() {
        System.out.println("ItemRemove");
        Item item = null;
        Store sto = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.ItemRemove(item, sto);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Itemupdate method, of class Administrator.
     */
    @Test
    public void testItemupdate() {
        System.out.println("Itemupdate");
        Item item = null;
        Store sto = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.Itemupdate(item, sto);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ItemAvailability method, of class Administrator.
     */
    @Test
    public void testItemAvailability() {
        System.out.println("ItemAvailability");
        Item item = null;
        Store sto = null;
        Numofitems no = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.ItemAvailability(item, sto, no);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Storeadd method, of class Administrator.
     */
    @Test
    public void testStoreadd() {
        System.out.println("Storeadd");
        Store sto = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.Storeadd(sto);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Storeremove method, of class Administrator.
     */
    @Test
    public void testStoreremove() {
        System.out.println("Storeremove");
        Store sto = null;
        Administrator instance = new Administrator();
        boolean expResult = true;
        boolean result = instance.Storeremove(sto);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of timings method, of class Administrator.
     */
    @Test
    public void testTimings() {
        System.out.println("timings");
        Store sto = null;
        Administrator instance = new Administrator();
        instance.timings(sto);
        
    }

    /**
     * Test of addCategories method, of class Administrator.
     */
    @Test
    public void testAddCategories() {
        System.out.println("addCategories");
        Store sto = null;
        Categories cat = null;
        Administrator instance = new Administrator();
        instance.addCategories(sto, cat);
        
    }

    /**
     * Test of removeCategories method, of class Administrator.
     */
    @Test
    public void testRemoveCategories() {
        System.out.println("removeCategories");
        Categories cat = null;
        Store st = null;
        Administrator instance = new Administrator();
        instance.removeCategories(cat, st);
        
    }

    /**
     * Test of assManager method, of class Administrator.
     */
    @Test
    public void testAssManager() {
        System.out.println("assManager");
        Store sto = null;
        Manager mg = null;
        Administrator instance = new Administrator();
        instance.assManager(sto, mg);
        
    }

    /**
     * Test of remManager method, of class Administrator.
     */
    @Test
    public void testRemManager() {
        System.out.println("remManager");
        Store sto = null;
        Administrator instance = new Administrator();
        instance.remManager(sto);
       
    }

    /**
     * Test of updateManager method, of class Administrator.
     */
    @Test
    public void testUpdateManager() {
        System.out.println("updateManager");
        Store sto = null;
        Manager mg = null;
        Administrator instance = new Administrator();
        instance.updateManager(sto, mg);
        
    }
    
}
