
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Devine Emanuels
 * @version 0.1
 */

public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of choices and executes
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    /**
     * Checking selected statement
     */
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("buy"))
        {
            getProduct();
        }
        else if(choice.equals("sell"))
        {
            loseProduct();
        }
        else if(choice.equals("check"))
        {
            checkProduct();
        }
        return false;
    }
   
    /**
     * adds a new product
     */
    private void addProduct()
    { 
        System.out.println("Adding a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        String name = reader.getString("Please enter the product name >");
        
        Product product = new Product(id, name);
        
        stock.add(product);
        stock.print();
    }
    
    /**
     * removes a new product
     */
    private void removeProduct()
    { 
        System.out.println("Adding a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        
        stock.remove(id);
        stock.print();
    }
    
    /**
     * buys a new product
     */
    private void getProduct()
    { 
        System.out.println("buy a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        int amount= reader.getInt("Please enter an amount to stock >");
        
        stock.buyProduct(id,amount);
        
    }
    
    /**
     * sells a new product
     */
    private void loseProduct()
    { 
        System.out.println("sell a Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        int amount= reader.getInt("Please enter an amount to stock >");
        
        stock.sellProduct(id,amount);
        
    }
    
    /**
     * checks a new product
     */
    private void checkProduct()
    { 
        System.out.println("check a Product");
        System.out.println();
        
        String id = reader.getString("Please enter a product id >");

        
        stock.searchForProduct(id);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product");
        System.out.println("    Sell:       sells a product");
        System.out.println("    Check:      checks a product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Student Name");
        System.out.println("********************************");
    }
    }