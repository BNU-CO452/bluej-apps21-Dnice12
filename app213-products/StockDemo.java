
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Devine Emanuels
 * @version 02/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Mercedes AMG GT"));
        stock.add(new Product(102, "BMW M8 GC"));
        stock.add(new Product(103, "Audi RS3"));
        stock.add(new Product(104, "Mercedes AMG GT"));
        stock.add(new Product(105, "BMW M8 GC"));
        stock.add(new Product(106, "Audi RS3"));
        stock.add(new Product(107, "Mercedes AMG GT"));
        stock.add(new Product(108, "BMW M8 GC"));
        stock.add(new Product(109, "Audi RS3"));
        stock.add(new Product(110, "Audi RS3"));
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101,8);
        stock.buyProduct(102,6);
        stock.buyProduct(103,4);
        stock.buyProduct(104,8);
        stock.buyProduct(105,6);
        stock.buyProduct(106,4);
        stock.buyProduct(107,8);
        stock.buyProduct(108,6);
        stock.buyProduct(109,4);
        stock.buyProduct(110,5);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,2);
        stock.sellProduct(102,4);
        stock.sellProduct(103,6);
        stock.sellProduct(101,2);
        stock.sellProduct(102,4);
        stock.sellProduct(103,6);
        stock.sellProduct(101,2);
        stock.sellProduct(102,4);
        stock.sellProduct(103,6);
        stock.sellProduct(101,2);
    
        
    }    
}