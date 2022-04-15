/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author parth
 */
public class Customer {
    
    ArrayList<Item> ShopCart = new ArrayList<>();
    
    Administrator admin;
    Store sto;
    Item it;
    
    String PreferredStore;
    String desc,replacestore,addstore,storesearch;
    
    void Customer()
    {
     ShopCart.add(0, null);
     ShopCart.add(ShopCart.size()-1, null); 
     PreferredStore = null;
     desc = null;
     storesearch = null;
     replacestore = null;
     addstore = null;
    }
    
    //to see personal perference of stores and cart
    ArrayList AccDetails()
    {
        return ShopCart;
    }
    
    String StoreLocator(String search)
    {
        String ret = null;
        search = storesearch;
        for(int i = 0; i < admin.stores.size(); i++)
        {
            if(admin.stores.get(i).location.equals(search)){
                ret = admin.stores.get(i).location;
            }

        }
        return ret;
    }
    
    String removePreferredStore(String replace)
    {
        replace = replacestore;
         PreferredStore = replace;
         return PreferredStore;
    }
    
    String addPreferredStore(String search)
    {
        for(int i = 0; i < admin.stores.size(); i++)
        {
            if(admin.stores.get(i).location.equals(search)){
                System.out.println(admin.stores.get(i).location);
            }
        }
        PreferredStore = search;
        return PreferredStore;
    }
    
     boolean itemavailability()
    {
        boolean b;
         b = sto.aval.get(it).availableitem;
        return b;
    }
    
    
   
}
