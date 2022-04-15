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
public class UserTest {

public UserTest() {
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
     * Test of signup method, of class User.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        String name = "";
        String uname = "";
        String password = "";
        String security = "";
        Administrator admin = null;
        User instance = new User();
        instance.signup(name, uname, password, security, admin);
       }
    
}
