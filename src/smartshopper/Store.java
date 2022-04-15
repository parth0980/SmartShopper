/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartshopper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author parth
 */
public class Store {
    
    int stid;
    ArrayList<Item> it = new ArrayList<>();
    ArrayList<Item> sale_it = new ArrayList<>();
    ArrayList<Manager> mg = new ArrayList<>();
    ArrayList<Categories> cat=new ArrayList<>();
    String location;
    Map<Item,Numofitems> aval;
    double opentime,closetime;
    String StoreSearch;
    
    void Store()
    {    
        stid = 0;
        
        it.set(0, null);
        it.set(it.size()-1,null);
        sale_it.set(0, null );
        sale_it.set(sale_it.size() - 1, null);
        mg.set(0, null);
        mg.set(mg.size()-1, null);
        aval.put(null, null);
    }
    
    // to updatee the timings of the store
     void timings(double opentime, double closetime)
     {
      this.opentime = opentime; 
      this.closetime = closetime; 
     }
    

}
