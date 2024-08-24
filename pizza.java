class Login
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static String def="\u001B[0m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String skblue="\u001B[36m";
	static String Bold = "\033[0;1m";
	String username;
	String password;
	long phno;
	void sign(int a)
	{
	        if(a==1)
		{
			register();
		}
		else if(a==2)
		{
			login(sc.nextLong(),sc.next(),sc.next());
		}
		else
		{
			System.out.println(red+"PLEASE ENTER VALID INPUT");
			sign(sc.nextInt());
		}
	}
   	void login(long b,String s1,String s2)
        {
	       if(b!=phno && s1!=username && s2!=password)
	      {
		System.out.println(red+blink+"**INVALID NUMBER** \n *REGISTER AGAIN*");
			long phno1=sc.nextLong();
			String username1=sc.next();
			String password1=sc.next();
			if(phno1==phno && username1==username && password1==password)
                        {
                           System.out.println(green+blink+"\n\t\t\t\t\t\t\t*login success!*");
                        }
			else
			{ 
			     register();
			}
		} 
	      else
	      {
                 System.out.println(green+blink+"\n\t\t\t\t\t\t\t*login success!*");
	      }

        }
        void register()		
        {      
	      System.out.println(Bold+"Username :");
              String username=sc.next();
              System.out.println(Bold+"Create Password :");
              String password=sc.next();
              System.out.println(Bold+"Enter Your Valid Mobile Number:");
              phno=sc.nextLong();                                                                    
              System.out.println(green+blink+"\n\t\t\t\t\t*REGISTRATION SUCCESS!*\n\n\t\t\t\t\t**LOGIN NOW**");
	      System.out.println(Bold+"Enter Your registered Mobile Number,username,password");
	      login(sc.nextLong(),sc.next(),sc.next());
        } 

}
interface I1
{
      void pizzahut();
      void macdonalds();
      void dominos();
}
class Restuarant implements I1
{
       static java.util.Scanner sc=new java.util.Scanner(System.in);
	static String RESET = "\u001B[0m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String skblue="\u001B[36m";
	static String Bold = "\033[0;1m";

	float bill=0f;
	void shop()
	{	
		 System.out.println(skblue+"CHOOSE YOUR HAPPY PIZZA FROM THE BELOW LIST");
       		 System.out.println(Bold+" 1 .Pizzahut");
                 System.out.println(Bold+" 2 .Macdonalds");
                 System.out.println(Bold+" 3 .Dominos");
                 int a=sc.nextInt();
		 if(a==1)
		 {
		    pizzahut();
		 }
		 else if(a==2)
		 {
		    macdonalds();
	         }
		 else if(a==3)
		 {
		    dominos();
		 }  
	}  
       public void pizzahut()
       {
	   System.out.println(purple+blink+"\n\t\t\t\t\t*WELCOME TO PIZZAHUT*");
	   System.out.println(purple+Bold+"CHOOSE YOUR ITEMS FROM THE BELOW LIST");
	   System.out.println(Bold+"1.Pizza");
           System.out.println(Bold+"2.Burger");
           int b=sc.nextInt();
           if(b==1)
	   {
	  	System.out.println(skblue+"!!Enter size of pizza!!!");
          	System.out.println(Bold+" 1. Small pizza(cheese,chicken&herbs)     - 100/-");
	  	System.out.println(Bold+" 2. Medium pizza(cheese,Mushroom,Tomato)  - 150/-");
	  	System.out.println(Bold+" 3. Large pizza(cheese,Paneer,Onion)      -200/- ");
          	int c=sc.nextInt();
          	if(c==1)
 	  	{ 
	    		System.out.println(yellow+"You've got Yummy pizza(small)!!!");
	    		System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    		int t=sc.nextInt();
	    		if(t==1)
	    		{
				System.out.println(Bold+"1.Sausage    -   30/-");
				System.out.println(Bold+"2.Pepper     -   20/-");
				int s=sc.nextInt();
				if(s==1)
				{
					bill=bill+130f;
				}
				else if(s==2)
				{
					bill=bill+120f;
				}
	    		}
	    		else if(t==2)
	    		{
				bill=bill+100f;
	    		}
          	}
          	else if(c==2)
   	  	{
	    		System.out.println(yellow+"You've got Yummy pizza(Medium)!!!");
	    		System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    		int t=sc.nextInt();
	    		if(t==1)
	    		{
				System.out.println(Bold+"1.Sausage    -   30/-");
				System.out.println(Bold+"2.Pepper    -   20/-");
		                int s=sc.nextInt();
		                if(s==1)
		                {
					bill=bill+180f;
				}
				else if(s==2)
				{
					bill=bill+170f;
				}
	    		}
	    		else if(t==2)
	    		{
				bill=bill+150f;
	    		}
    	  	}
    	 	else if(c==3)
         	{
	    		System.out.println(yellow+"You've got Yummy pizza(Large)!!!");
	    		System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    		int t=sc.nextInt();
	    		if(t==1)
	    		{
				System.out.println(Bold+"1.Sausage    -   30/-");
				System.out.println(Bold+"2.Pepper    -   20/-");
				int s=sc.nextInt();
				if(s==1)
				{
					bill=bill+230f;
				}
				else if(s==2)
				{
					bill=bill+220f;
				}
	    		}
	    		else if(t==2)
	    		{
				bill=bill+200f;
	    		}
          	}
        }
        if(b==2)
	{ 
         	System.out.println(Bold+" 1. Chicken Burger   - 200/-");
         	System.out.println(Bold+" 2. Veg Burger       -100/-");
	 	int d=sc.nextInt();
	 	if(d==1)
         	{
            		bill=bill+200f;
         	}
         	else if(d==2)
         	{
           		bill=bill+100f;
         	}
        }
	System.out.println(skblue+"DO YOU WANT TO ADD ANYTHING?");
	System.out.println(Bold+"1.Yes");
	System.out.println(Bold+"2.No");
     	int c=sc.nextInt();
	if(c==1)
	{
	    pizzahut();
	    
        } 
	else if(c==2)
	{
	   Pay p1=new Pay();
	   float totalbill=bill;
	  System.out.println(Bold+"      @@@@@@@@@@@@@!!!!TOTAL BILL!!!!@@@@@@@@@@@@@@   "+totalbill+" /-");
	}
     }
       public void macdonalds()
       {
		System.out.println(purple+blink+"\n\t\t\t\t\t*WELCOME TO MACDONALDS!!*");
		System.out.println(Bold+"CHOOSE YOUR ITEMS FROM THE BELOW LIST");
		System.out.println(Bold+"1.Pizza");
        	System.out.println(Bold+"2.Burger");
        	int b=sc.nextInt();
        	if(b==1)
		{
	 		System.out.println(skblue+"Enter size of pizza!!!");
          		System.out.println(Bold+" 1. Small pizza(cheese,chicken&herbs)    - 100/-");
	  		System.out.println(Bold+" 2. Medium pizza(cheese,Mushroom,Tomato) - 150/-");
	  		System.out.println(Bold+" 3. Large pizza(cheese,Paneer,Onion)     - 200/- ");
          		int c=sc.nextInt();
          		if(c==1)
 	  		{ 
	    			System.out.println(yellow+"You've got Yummy pizza(small)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper     -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+130f;
					}
					else if(s==2)
					{
						bill=bill+120f;
					}
	    			}
	    			else if(t==2)
	    			{
					bill=bill+100f;
	    			}
          		}
          		else if(c==2)
   	  		{
	    			System.out.println(yellow+"You've got Yummy pizza(Medium)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper    -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+180f;
					}
					else if(s==2)
					{
						bill=bill+170f;
					}
	    			}
	    			else if(t==2)
	    			{
						bill=bill+150f;
	    			}
    	  		}
    	  		else if(c==3)
          		{
	   			System.out.println(yellow+"You've got Yummy pizza(Large)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper    -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+230f;
					}
					else if(s==2)
					{
						bill=bill+220f;
					}
	    			}
	    			else if(t==2)
	    			{
					bill=bill+200f;
	   			}
          		}
       		 }
        	if(b==2)
		{ 
             		System.out.println(" 1. Chicken Burger - 200/-");
         		System.out.println(" 2. Veg Burger     - 100/-");
	 		int d=sc.nextInt();
	 		if(d==1)
         		{
           			 bill=bill+200f;
         		}
         		else if(d==2)
         		{
         			  bill=bill+100f;
         		}
        	}
		System.out.println(skblue+"DO YOU WANT TO ADD ANYTHING?");
		System.out.println(Bold+"1.YES \n2.NO");
     		int c=sc.nextInt();
		if(c==1)
		{
	    		pizzahut();  
        	} 
		else if(c==2)
		{
	   		Pay p1=new Pay();
	   		float totalbill=bill;
	   		System.out.println(Bold+"      @@@@@@@@@@@@@!!!!TOTAL BILL!!!!@@@@@@@@@@@@@@   "+totalbill+" /-");
		}
	}
     public void dominos()
     {
		System.out.println(purple+blink+"\n\t\t\t\t\t*WELCOME TO DOMINOS!!*");
		System.out.println(Bold+"CHOOSE YOUR ITEMS FROM THE BELOW LIST");
		System.out.println(Bold+"1.Pizza");
        	System.out.println(Bold+"2.Burger");
        	int b=sc.nextInt();
        	if(b==1)
		{
	  		System.out.println(skblue+"Enter size of pizza!!!");
          		System.out.println(Bold+" 1. Small pizza(cheese,chicken&herbs)    - 100/-");
	  		System.out.println(Bold+" 2. Medium pizza(cheese,Mushroom,Tomato) - 150/-");
	  		System.out.println(Bold+" 3. Large pizza(cheese,Paneer,Onion)     - 200/- ");
          		int c=sc.nextInt();
         		if(c==1)
 	  		{ 
	    			System.out.println(yellow+"You've got Yummy pizza(small)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper     -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+130f;
					}
					else if(s==2)
					{
						bill=bill+120f;
					}
	    			}
	    			else if(t==2)
	    			{
					bill=bill+100f;
	    			}
          		}
          		else if(c==2)
   	  		{
	  			System.out.println(yellow+"You've got Yummy pizza(Medium)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper    -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+180f;
					}
					else if(s==2)
					{
						bill=bill+170f;
					}
	    			}
	    			else if(t==2)
	    			{
						bill=bill+150f;
	    			}
    	 	      }
    	  	      else if(c==3)
          	      {
	    			System.out.println(yellow+"You've got Yummy pizza(Large)");
	    			System.out.println(Bold+"Want to add toppings?\n\n 1.Yes\n 2.No");
	    			int t=sc.nextInt();
	    			if(t==1)
	    			{
					System.out.println(Bold+"1.Sausage    -   30/-");
					System.out.println(Bold+"2.Pepper    -   20/-");
					int s=sc.nextInt();
					if(s==1)
					{
						bill=bill+230f;
					}
					else if(s==2)
					{
						bill=bill+220f;
					}
			       }
			       else if(t==2)
	    		       {
						bill=bill+200f;
	    		       }
 	   
 	   
          	     }
             }
             if(b==2)
	     {	 
         		System.out.println(" 1. Chicken Burger - 200/-");
         		System.out.println(" 2. Veg Burger     - 100/-");
	 		int d=sc.nextInt();
	 		if(d==1)
         		{
            			bill=bill+200f;
         		}
         		else if(d==2)
         		{
           			bill=bill+100f;
         		}
             }
	     System.out.println(skblue+"DO YOU WANT TO ADD ANYTHING?");
	     System.out.println(Bold+"1.YES \n 2.NO");
     	     int c=sc.nextInt();
	     if(c==1)
	     {
	    		pizzahut();
             } 
	     else if(c==2)
	     {
	   		Pay p1=new Pay();
	   		float totalbill=bill;
	   		System.out.println(Bold+"      @@@@@@@@@@@@@!!!!TOTAL BILL!!!!@@@@@@@@@@@@@@   "+totalbill+" /-");
	     }
	}
}
abstract class Transaction
{
	abstract void payment(String upiid);
	abstract void payment(long phonenumber);
}
class Pay extends Transaction
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static String def="\u001B[0m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String skblue="\u001B[36m";
	static String Bold = "\033[0;1m";

	Pay()
	{
	    System.out.println(yellow+"YOU CAN PAY THROUGH UPI ID OR MOBILE NUMBER");
	    System.out.println(Bold+"1.UPI \n2.MOBILE NUMBER");
	    int p=sc.nextInt();
	    if(p==1)
	    {
		System.out.println(yellow+"PAYMENT THROUGH UPI ID!!!");
	 	payment(sc.next());
	    }
	    else if(p==2)
	    {
		System.out.println(yellow+"PAYMENT THROUGH MOBILE NUMBER!!!");
	 	payment(sc.nextLong());
	     }
	}
	void payment(String upiid)
	{
		System.out.println(green+blink+"\n\t\t\t\t\t*Transaction Successful*");
		
	}
	void payment(long phonenumber)
	{
		System.out.println(green+blink+"\n\t\t\t\t\t*Transaction Successful*");
		
	}
}
class User
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static String def="\u001B[0m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String skblue="\u001B[36m";
	static String Bold = "\033[0;1m";

	public static void main(String[]args)
	{
	    System.out.println(skblue+blink+"\n\t\t\t\t\t ******WELCOME TO HAPPY PIZZA******");			
	    System.out.println(Bold+"1.Register");	
            System.out.println(Bold+"2.Login");
	    Login a=new Login();
            a.sign(Login.sc.nextInt());
	    Restuarant r=new Restuarant();
	    r.shop();  
	    
	}
}