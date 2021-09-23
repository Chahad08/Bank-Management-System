package classes;
import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity

{ 
	protected String pid;
    protected String name;
    protected int availableQuantity;
    protected double price;
	
	
    public void setPid(String pid){this.pid=pid;};
    public void setName(String name){this.name=name;};
    public void setAvailableQuantity(int quantity){ availableQuantity=quantity;};
    public void setPrice(double price){this.price=price;};
	
	
    public String getPid( ){return pid;}
    public String getName( ){return name;}
    public int getAvailableQuantity( ){return availableQuantity;}
    public double getPrice( ){return price;}
	
	
    public abstract void showInfo( );

	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Available Quantity: "+ availableQuantity);
			System.out.println("Adding Amount: "+ amount);
			availableQuantity += amount;
			
			System.out.println("Current Available Quantity: "+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Previous Available Quantity:	"+ availableQuantity);
			System.out.println("Selling Amount:	"+ amount);
			availableQuantity -= amount;
			System.out.println("Current Available Quantity:	"+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}	
}