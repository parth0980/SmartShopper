/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class User {
    String uname;
    String name;
    String password;
    String security;
    ArrayList store;
    
     User()
    {
    uname = null;
    name = null;
    password = null;
    security = null;
    store =  null;
    }
    
    void signup(String name, String uname, String password, String security, Administrator admin)
    {
        this.name = name;
        this.uname = name;
        this.password = password;
        this.security = security;
        this.store = admin.stores;
        
    
    }
}
