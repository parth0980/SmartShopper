/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

/**
 *
 * @author parth
 */
public class Manager {
    Store assistore;
   
    void Manager()
    {
        Store assistore1 = assistore;
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
   
   //setting layout as per item 
   void SetLayout(Item it)
   {
       
       
   }
   
    // to updatee the timings of the store
   boolean timings(Store sto,int opentime,int closetime)
   {
    sto.timings(opentime,closetime);
    return true;
   }

   
    //to add categories of the current store
   boolean addCategories(Categories cat,Store sto)
   {
     sto.cat.add(cat);
     return true;
   }
   
   //to remove the categories from the current store
   boolean removeCategories(Categories Cat, Store sto)
   {
       sto.cat.remove(Cat);
       return true;
   }

    
}
