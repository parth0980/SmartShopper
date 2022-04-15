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
public class Visitor {
    int visitor;
    
    void Visitor()
    {
    visitor = 0;
    }
    
    void addvisitor()
    {
    visitor = visitor + 1;
    
    }
    
    int totalvisitors()
    {
    return visitor;
    }
    
}
