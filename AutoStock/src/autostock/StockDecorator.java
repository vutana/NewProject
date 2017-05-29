
package autostock;


public abstract class StockDecorator implements UsedStock{
    protected UsedStock decoratedUsedStock;
    
    public StockDecorator(UsedStock decoratedUsedStock){
    this.decoratedUsedStock = decoratedUsedStock;
    
    }
  @Override
    public void display(){
    decoratedUsedStock.display();
    }
}
