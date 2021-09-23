package classes;
import java.lang.*;
import interfaces.*;


public class Shop implements ProductOperations
{
	private String name;
	private String nid;
	private Product products[ ] = new Product[10];
	
	
	public void setName(String name){this.name = name;}
	public void setNid(String nid){this.nid = nid;}
	
	
	public String getName(){return name;}
	public String getNid(){return nid;}
	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeProduct(Product p)

	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Product searchProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid( ) == pid)
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
	
	public void showAllProducts( )
	{
		for(int i =0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				products[i].showInfo();
			}
		}
	}
}