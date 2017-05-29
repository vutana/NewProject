
public class InventoryFactory {
    public Inventory getInventory(String inventoryType){
      if(inventoryType == null){
         return null;
      }		
      if(inventoryType.equalsIgnoreCase("New")){
         return new New();
         
      } else if(inventoryType.equalsIgnoreCase("Used")){
         return new Used();
         
      } 
      
      return null;
   }
}

