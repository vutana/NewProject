
public class FactoryPatternTest {
    public static void main(String[] args) {
      InventoryFactory inventoryFactory = new InventoryFactory();

      //get an object of New and call its display method.
      Inventory inventory1 = inventoryFactory.getInventory("NEW");

      //call draw method of Circle
      inventory1.display();

      //get an object of Used and call its display method.
      Inventory inventory2 = inventoryFactory.getInventory("USED");

      //call draw method of Rectangle
      inventory2.display();

      
   }
}
