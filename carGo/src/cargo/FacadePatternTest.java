
package cargo;


public class FacadePatternTest {
    public static void main(String[] args){
    Facade facade = new Facade ();
    
    facade.goInventory();
    facade.goCommission();
    facade.goServiceDept();
    
    }
}
