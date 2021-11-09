
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
        
        stock.add(new Product(101, "Audi TT"));
        stock.add(new Product(102, "BMW M8 GC"));
        stock.add(new Product(103, "Audi RS3"));
        stock.add(new Product(104, "Mercedes AMG GT"));
        stock.add(new Product(105, "Range Rover Evoque"));
        stock.add(new Product(106, "Mercedes A class"));
        stock.add(new Product(107, "Audi A8"));
        stock.add(new Product(108, "Vauxhall Astra Griffin"));
        stock.add(new Product(109, "Peugeot E-208"));
        stock.add(new Product(110, "BMW 220i"));
        
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
        stock.buyProduct(101,20);
        stock.buyProduct(102,16);
        stock.buyProduct(103,10);
        stock.buyProduct(104,24);
        stock.buyProduct(105,26);
        stock.buyProduct(106,26);
        stock.buyProduct(107,12);
        stock.buyProduct(108,18);
        stock.buyProduct(109,22);
        stock.buyProduct(110,30);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,2);
        stock.sellProduct(102,4);
        stock.sellProduct(103,6);
        stock.sellProduct(104,6);
        stock.sellProduct(105,8);
        stock.sellProduct(106,6);
        stock.sellProduct(107,12);
        stock.sellProduct(108,10);
        stock.sellProduct(109,12);
        stock.sellProduct(110,8);
    
        
    }    
}