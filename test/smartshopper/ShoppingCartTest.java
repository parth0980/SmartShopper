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
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
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
     * Test of ItemSearch method, of class ShoppingCart.
     */
    @Test
    public void testItemSearch() {
        System.out.println("ItemSearch");
        Store st = null;
        Item ite = null;
        ShoppingCart instance = new ShoppingCart();
        String expResult = "";
        String result = instance.ItemSearch(st, ite);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of CategorySearch method, of class ShoppingCart.
     */
    @Test
    public void testCategorySearch() {
        System.out.println("CategorySearch");
        Store st = null;
        Categories cat = null;
        ShoppingCart instance = new ShoppingCart();
        String expResult = "";
        String result = instance.CategorySearch(st, cat);
        assertEquals(expResult, result);
            }

    /**
     * Test of ItemAdd method, of class ShoppingCart.
     */
    @Test
    public void testItemAdd() {
        System.out.println("ItemAdd");
        Item i = null;
        Customer cs = null;
        ShoppingCart instance = new ShoppingCart();
        instance.ItemAdd(i, cs);
      
    }

    /**
     * Test of ItemRemove method, of class ShoppingCart.
     */
    @Test
    public void testItemRemove() {
        System.out.println("ItemRemove");
        Item i = null;
        Customer cs = null;
        ShoppingCart instance = new ShoppingCart();
        instance.ItemRemove(i, cs);
           }

    /**
     * Test of ItemDescription method, of class ShoppingCart.
     */
    @Test
    public void testItemDescription() {
        System.out.println("ItemDescription");
        Item i = null;
        Store st = null;
        ShoppingCart instance = new ShoppingCart();
        String expResult = "";
        String result = instance.ItemDescription(i, st);
        assertEquals(expResult, result);
          }
    
}
