
package cargo;


public class Facade {
    private Gocar inventory;
    private Gocar commission;
    private Gocar servicedept;
    
    public Facade(){
           inventory = new Inventory();
           commission = new Commission();
           servicedept = new ServiceDept();
           
  }
    public void goInventory(){
    inventory.go();
    }
    public void goCommission(){
    commission.go();
    }
    public void goServiceDept(){
    servicedept.go();
    }

}
