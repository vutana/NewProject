
package autostock;


public class UsedStockDecorator extends StockDecorator{
    public UsedStockDecorator(UsedStock decoratedUsedStock){
    super(decoratedUsedStock);
    
    
    }
    @Override
    public void display(){
    decoratedUsedStock.display();
    setEcoModel(decoratedUsedStock);
    }
    private void setEcoModel(UsedStock decoratedUsedStock){
    System.out.println("<----------------------------------->");
    }
}
