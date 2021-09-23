package interfaces;
import classes.Product;
import java.lang.*;


public interface ProductOperations
{
	boolean insertProduct(Product p);
    boolean removeProduct(Product p);
    Product searchProduct(String pid);
    void showAllProducts( );
}