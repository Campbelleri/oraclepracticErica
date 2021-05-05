package duke.choice;

/**
 * 
 * @author TCP
 *
 */
 public class customer  {
	private String name;

	/**
	 * @param args the command line arguments
	 * @param item 
	 */
	public static void main(String[] args, Object item) {
		System.out.println("Welcome to Duke Choice Shop!");
		
		customer cl =new customer ();
		cl.name ="Pinky";
		
		System.out.println("Customer is " + cl.name);
		
		 Clothing item1 = new Clothing();
		 Clothing item2 = new Clothing();
		 
		 item1.description = "Blue Jacket";
		 item1.price =20.99;
		 item1.size ="M";
		 
		 item2.description = "Orange T-Shirt";
		 item2.price= 10.5;
		 item2.size= "S";
		 
		 System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
				 
		
		
		

		}
}
			

		
 
 	
 	
 		
	 
		
	


