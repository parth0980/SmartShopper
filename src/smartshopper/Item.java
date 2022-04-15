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
public class Item {
    int id;
    String name;
    double price;
    String desc; //description
    double size;
    String Category;
    
    void Item()
    {
    id = 0;
    name = null;
    price = 0;
    desc = null;  
    size = 0;
    Category = null;
    }
    
    
    
    void updateid(int id)
    {
        this.id = id;
    }
    
    void updatename(String name)
    {
        this.name = name;
    }
    
    void updateprice(double price)
    {
        this.price = price;
    }
    
    void updatedesc(String desc)
    {
        this.desc = desc;
    }
    
    void updatesize(double size)
    {
        this.size = size;
    }
    
    void updateCategory(String Category)
    {
        this.size = size;
    }
    
}
