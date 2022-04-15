/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import java.util.Map;

/**
 *
 * @author parth
 */
public class UserAccount {
   
    Map<User,Store> user;
    Customer cust; 
    Administrator admin;
    User us;
    Item it;
    UserLogin uLogin;
    Visitor visit;
            
    void accoperation( )
    {
                    
        
        String operation = null;
        int i ;
        
        if(uLogin.loginB == true)
        {
        //depends on user selection for the operation they want to perform on their account
        switch(operation)
        {
            case "Get Account Details":
        cust.AccDetails();
                break;
            case "Locate Store":
        cust.StoreLocator( cust.storesearch);
                break;
            case "Add Store":
        cust.addPreferredStore(cust.addstore);
                break;
            case "Remove Store":
        cust.removePreferredStore(cust.PreferredStore);
                break;
            case "Add item":
                if(cust.itemavailability()){
        cust.ShopCart.add(it);
        visit.addvisitor();
                }
                break;
        }
        }
        else
        {
        uLogin.faillogin();
        uLogin.login(us.uname, us.password);
        }
    
    }
   
  
    
}
