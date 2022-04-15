package smartshopper;

import java.util.ArrayList;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class Administrator {

   ArrayList<Store> stores = new ArrayList<>();
   double opentime,closetime; 
   Map<Store,Manager> StoMan;
   
   void Administrator()
   {
 
        stores.set(0, null);
        stores.set(stores.size()-1, null);
        StoMan.put(null, null);
   
   }
   
    //to add items from store listing
   boolean ItemAdd(Item item, Store sto)
   {    
       sto.it.add(item);
       return true;
   }
   
   //to remove item from store listing
   boolean ItemRemove(Item item, Store sto)
   {
       boolean flag = sto.it.contains(item);
       if(flag == true)
       {
       int i =  sto.it.indexOf(item);
       sto.it.remove(i);
       }
      return true;
   }
   
   //to update item info
   boolean Itemupdate(Item item, Store sto)
   {
       for(int j = 0; j < sto.it.size(); j++)
       {
        if(sto.it.get(j).id == item.id)
        {
            sto.it.get(j).updatename(item.name);
            sto.it.get(j).updateprice(item.price);
            sto.it.get(j).updatedesc(item.desc);
            sto.it.get(j).updatesize(item.size);
        }
       }
      return true;
   }
    
   //to update the availability
   boolean ItemAvailability(Item item, Store sto, Numofitems no)
   {
       boolean b = no.availableitem;
       if(b == no.available())  // if available
       {
       sto.aval.containsValue(item);
       sto.aval.put(item, no);
       b = true;
       }
       else                     // not available
       {
       b=false;
       }
       return b;
   }
   
   //to add another store to the list
   boolean Storeadd(Store sto)
   {
       stores.add(sto);
       return true;
   }

   //to remove current store from the list
   boolean Storeremove(Store sto)
   {
    boolean flag = stores.contains(sto);
       if(flag == true)
       {
       int i =  stores.indexOf(sto);
       stores.remove(i);
       }
      return true;
   }
   
   // to updatee the timings of the store
   void timings(Store sto)
   {
       //it updates the time but for now we are only passing values and not taking input
        sto.timings(this.opentime,this.closetime);
   }
   
   //to add categories of the current store
   void addCategories(Store sto,Categories cat)
   {
      sto.cat.add(cat);
   }
   
   //to remove the categories from the current store
   void removeCategories(Categories cat,Store st)
   {
       boolean flag = st.cat.contains(cat);
       if(flag == true)
       {
       int i =  st.cat.indexOf(cat);
       stores.remove(i);
       }
   }

   //ass Manager
   void assManager(Store sto,Manager mg)
   {
       StoMan.put(sto,mg);
   }
   
   //rem Manager
   void remManager(Store sto)
   {
       StoMan.remove(sto);
   }
   
   //update current manager
   void updateManager(Store sto,Manager mg)
   {
       boolean b = StoMan.containsKey(sto);
       if(b == true)
       {
        StoMan.put(sto,mg);
       }
   }
}
