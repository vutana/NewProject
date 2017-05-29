
package autostock;


public class DecoratorPatternTest {
      public static void main(String[] args){
      
          //UsedStock usedecostock = new UsedEcoStock();
      
      UsedStock oldUsedEcoStock = new UsedStockDecorator(new UsedEcoStock());
      
      UsedStock oldSportyUsedStock = new UsedStockDecorator(new SportyUsedStock());
     
     // System.out.println("Used Economy Inventory:: ");
      //usedecostock.display();
      
      System.out.println("Used Economy Inventory::");
      oldUsedEcoStock.display();
      
      System.out.println("Used Sporty Inventory::");
      oldSportyUsedStock.display();
      }
}
