/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;


import java.util.LinkedList;

/**
 *
 * @author parth
 */
public class UserLogin  {
    
    Boolean loginB;
    
    boolean login( String uname, String password)
    {
       
        
       // if(details.  == verification.user.get(i).uname && user.password == verification.user.get(i).password)
        {
        loginB = true;
        }
        //else
        {
        loginB = false;
        faillogin();
        }
        return loginB;
    }
    
    boolean faillogin()
    {
     if(loginB == false)
     {
        System.out.println("Failed Login");
     }
     return loginB;
    }
    
    
    void addAccount(UserAccount add,User us,Store st)
    {
       add.user.put(us, st);      
    }
 
    
}
