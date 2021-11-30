
/**
 * Initiates the interface of the Program
 *
 * @author Devine Emanuels
 * @version 30/11/2021
 */

public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
