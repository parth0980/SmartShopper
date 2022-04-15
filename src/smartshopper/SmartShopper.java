/**
 *
 * @author parth
 */

package smartshopper;


public class SmartShopper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrator admin = new Administrator();
        Manager mg = new Manager();
        Item it=new Item();
        Store sto = null;
        Login window = new Login();
        window.setVisible(true);
        
    }
    
}
