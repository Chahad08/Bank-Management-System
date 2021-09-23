import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;



public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Market Management Application");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You Choose Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(m.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							m.showAllEmployees();
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
	

              
	
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You Choose Shop Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Search A Shop");
					System.out.println("\t4. Show All Shop");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert A Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
							String nid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							Shop s1 = new Shop();
							s1.setNid(nid1);
							s1.setName(name1);
							
							if(m.insertShop(s1)){System.out.println("Shop Inserted with NID: "+s1.getNid());}
							else{System.out.println("Shop can not be inserted");}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Existing Shop ");
							System.out.println("---------------------------------");
							
							System.out.print("Enter a Shop ID to Remove: ");
							
							String nid2 = sc.next();
							
							Shop s2 = m.searchShop(nid2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2)){ System.out.println("Shop Removed with ID: "+s2.getNid());}
								else{System.out.println("Shop Can Not be Removed......");}
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
							String nid3 = sc.next();
							
							Shop s3 = m.searchShop(nid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found");
								System.out.println("Shop Name: "+s3.getName());
								System.out.println("Shop NID: "+s3.getNid());
								m.showAllShops( );
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
					
							break;
							
						case 4:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to See All Shops");
							System.out.println("---------------------------------");
	
							m.showAllShops( );
						
							break;
							
						case 5:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				
				
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("You Choose  Shop Product Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Product for a Shop");
					System.out.println("\t2. Remove Existing Product of a Shop");
					System.out.println("\t3. Search An Product for a Shop");
					System.out.println("\t4. Show All Product of a Shop");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Create a Product for a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
							
							String nid1 = sc.next();
							
							if(m.searchShop(nid1) != null)
							{
								System.out.println("\tWhat type of Product do you want to create?");
								System.out.println("\t1. Local Product ");
								System.out.println("\t2. Imported Product");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Product Type: ");
								int productType = sc.nextInt();
								
                                Product p = null;
								if(productType == 1)
								{
									System.out.print("Enter Product ID: ");
									String pd1 = sc.next();
									System.out.print("Enter Product NAME: ");
									String pn1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
								    double pr1=sc.nextDouble();
									System.out.print("Enter Discount Rate: ");
									double ir = sc.nextDouble();
									
									LocalProduct lp = new LocalProduct();
									lp.setPid(pd1);
									lp.setName(pn1);
									lp.setAvailableQuantity(aq1);
									lp.setPrice(pr1);
									lp.setDiscountRate(ir);
									p=lp;

									if(m.searchShop(nid1).insertProduct(p))
									{
										System.out.println("Product Inserted for "+ nid1 + " with Product ID " + pd1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
									
									
								}
								
								else if(productType == 2)
								{
									System.out.print("Enter Product ID: ");
									String pd1 = sc.next();
									System.out.print("Enter Product NAME: ");
									String pn1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
								    double pr=sc.nextDouble();
									System.out.print("Enter Country Name: ");
									String ty = sc.next();
									
									ImportedProduct ip = new ImportedProduct();
									ip.setPid(pd1);
									ip.setName(pn1);
									ip.setAvailableQuantity(aq1);
									ip.setPrice(pr);
									ip.setCountryName(ty);
								    p=ip;
									if(m.searchShop(nid1).insertProduct(p))
									{
										System.out.println("Product Inserted for "+ nid1 + " with Product ID " + pd1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
								}
								else if(productType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid Product Type");
								}
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							
							break;
							
						case 2:
						    System.out.println("Remove Existing Shop");

							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							Shop ss=m.searchShop(sid4);
							
							if(ss != null)
								
							{
								System.out.print("Enter Product Id: ");
							    String pr = sc.next();
								Product pp=ss.searchProduct(pr);
							
								 if(ss.removeProduct(pp)){ System.out.println("Product Removed with ID: "+pp.getPid( ));}
								 else{System.out.println("Product Can Not be Removed......");}
								 
								 System.out.println("-----------------------------------------");
                                 System.out.println("-----------------------------------------");
								 m.showAllShops( );
								 System.out.println("-----------------------------------------");
								 System.out.println("-----------------------------------------");	
							
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							break;
							
						case 3:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
							String nid33 = sc.next();
							System.out.print("Enter Product PID: ");
							String pid3 = sc.next();
							
							Product p33 = m.searchShop(nid33).searchProduct(pid3);
							
							if(p33 != null)
							{
								p33.showInfo( );
								System.out.println("INFO ENDS");
							}
							else
							{
								System.out.println("Product Does Not Exist");
							}
					
							
							break;
						case 4:
							    System.out.println("---------------------------------");
							    System.out.println("You Choose to See All Shops & Product");
							    System.out.println("---------------------------------");
	
							    m.showAllShops( );
							break;
						
						case 5:
						       System.out.println("---------------------------------");
                               System.out.println("You Choose to Go Back.......");
							   System.out.println("---------------------------------");
							break;
							
						default:
							   System.out.println("Invalid Option............");
							break;
					}
					
					break;
					
					
					
				
					
				case 4:
					System.out.println("---------------------------------");
					System.out.println("You Choose Product Quantity Add-Sell");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Product");
					System.out.println("\t2. Sell Product");
					System.out.println("\t3. Show Add Sell History ");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Add Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
		
							String nid1 = sc.next();
							
							if(m.searchShop(nid1) != null)
							{
								System.out.print("Enter Product ID: ");
								String an1 = sc.next();
								
								if(m.searchShop(nid1).searchProduct(an1) != null)
								{
									System.out.print("Enter Amount to Add Quantity: ");
									int am = sc.nextInt();
									if(m.searchShop(nid1).searchProduct(an1).addQuantity(am))
									{
										System.out.println("Add Quantity Successfull");
										frwd.writeInFile("Add Quantity: "+ am +" Product ID " + an1 + " by " + nid1);
									}
									else
									{
										System.out.println("Can Not Add Quantity");
									}
								}
								else
								{
									System.out.println("Invalid Product Number");
								}
								
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Sell Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop NID: ");
		
							String nid2 = sc.next();
							
							if(m.searchShop(nid2) != null)
							{
								System.out.print("Enter Product ID: ");
								String an2 = sc.next();
								
								if(m.searchShop(nid2).searchProduct(an2) != null)
								{
									System.out.print("Enter Amount to Sell Quantity: ");
									int am2 = sc.nextInt();
									if(m.searchShop(nid2).searchProduct(an2).sellQuantity(am2))
									{
										System.out.println("sell Quantity Successfull");
										frwd.writeInFile("sell Quantity: "+ am2 +" Product ID " + an2 + " by " + nid2);
									}
									else
									{
										System.out.println("Can Not sell Quantity");
									}
								}
								else
								{
									System.out.println("Invalid Product Number");
								}
								
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose See Transaction History");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						    System.out.println("---------------------------------");
                            System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
							
						default:
						     System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				case 5:
					System.out.println("---------------------------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------------------------");
					repeat = false;
					break;
				
				default:
					System.out.println("-----------------------------------");
					System.out.println("Invalid Choice.....");
					break;
			}
			System.out.println("-----------------------------------\n");
		}
	}
}