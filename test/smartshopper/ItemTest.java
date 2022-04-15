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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of Item method, of class Item.
     */
    @Test
    public void testItem() {
        System.out.println("Item");
        Item instance = new Item();
        instance.Item();
       
    }

    /**
     * Test of updateid method, of class Item.
     */
    @Test
    public void testUpdateid() {
        System.out.println("updateid");
        int id = 0;
        Item instance = new Item();
        instance.updateid(id);
        
    }

    /**
     * Test of updatename method, of class Item.
     */
    @Test
    public void testUpdatename() {
        System.out.println("updatename");
        String name = "";
        Item instance = new Item();
        instance.updatename(name);
        
    }

    /**
     * Test of updateprice method, of class Item.
     */
    @Test
    public void testUpdateprice() {
        System.out.println("updateprice");
        double price = 0.0;
        Item instance = new Item();
        instance.updateprice(price);
     
    }

    /**
     * Test of updatedesc method, of class Item.
     */
    @Test
    public void testUpdatedesc() {
        System.out.println("updatedesc");
        String desc = "";
        Item instance = new Item();
        instance.updatedesc(desc);
       
    }

    /**
     * Test of updatesize method, of class Item.
     */
    @Test
    public void testUpdatesize() {
        System.out.println("updatesize");
        double size = 0.0;
        Item instance = new Item();
        instance.updatesize(size);
       
    }

    /**
     * Test of updateCategory method, of class Item.
     */
    @Test
    public void testUpdateCategory() {
        System.out.println("updateCategory");
        String Category = "";
        Item instance = new Item();
        instance.updateCategory(Category);
        
    }
    
}
