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
class Numofitems {
    boolean availableitem;
    
    boolean available()
    {
    availableitem = true;
    return availableitem;
    }
    
  
            
    boolean notavailable()
    {
    availableitem = false;
    return availableitem;
    }
}
