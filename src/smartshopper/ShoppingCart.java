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
public class ShoppingCart {
    UserLogin uLogin;
    
    
    
    
    
    String ItemSearch(Store st,Item ite)
    {
        
        
        
        String itemret = null;
        
        for(int i = 0; i < st.it.size(); i++)
        {
            if(st.it.equals(ite)){
                itemret = st.it.toString();
            }

        }
        
        
        
         return itemret;
       
    }
    
    String CategorySearch(Store st, Categories cat)
    {
        
         
        String Category = null;
         for(int i = 0; i < st.cat.size(); i++)
        {
            if(st.it.equals(cat)){
               Category =  st.cat.toString();
            }

        }
         
        return Category;
 
    }
    
    void ItemAdd(Item i,Customer cs)
    {
        cs.ShopCart.add(i);
    }
    
     void ItemRemove(Item i,Customer cs)
    {
        cs.ShopCart.remove(i);
    }
     
     String ItemDescription(Item i,Store st)
     {
         String des = null;
         int a=0;
            while(a<st.it.size())
            {
             if(i.equals(st.it.get(a)))
                     {
                     des = st.it.get(a).desc;
                     }
            
            }
            return des;
     }
    
}
