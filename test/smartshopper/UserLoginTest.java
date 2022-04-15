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
public class UserLoginTest {
    
    public UserLoginTest() {
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
     * Test of login method, of class UserLogin.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String uname = "";
        String password = "";
        UserLogin instance = new UserLogin();
        boolean expResult = false;
        boolean result = instance.login(uname, password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of faillogin method, of class UserLogin.
     */
    @Test
    public void testFaillogin() {
        System.out.println("faillogin");
        UserLogin instance = new UserLogin();
        boolean expResult = false;
        boolean result = instance.faillogin();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addAccount method, of class UserLogin.
     */
   
}
