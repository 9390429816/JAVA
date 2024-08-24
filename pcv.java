
class Restuarant implements I1
{
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    static Restuarant res=new Restuarant();
       static void pizzahut()
       {
	System.out.println(YELLOW+blink+"\n\t\t\t\t\t*WELCOME TO PIZZAHUT*"+RESET);
	System.out.println("1.Pizza");
        System.out.println("2.Burger");
        int b=sc.nextInt();
        if(b==1)
	{
	  System.out.println("Enter size of pizza!!!");
          System.out.println(" 1. Small ");
	  System.out.println(" 2. Medium");
	  System.out.println(" 3. Large ");
          int c=sc.nextInt();
          if(c==1)
 	  { 
	   float bill=bill+100f;
 	   System.out.println("Small Pizza     ---------> "+bill+"/-");
          }
          else if(c==2)
   	  {
	   float bill=bill+150f;
 	   System.out.println("Medium Pizza    ---------> "+bill+"/-");
    	  }
    	  else if(c==3)
          {
           float bill=bill+200f;
 	   System.out.println("Large Pizza      ---------> "+bill+"/-");
          }
        }
        if(b==2)
	{ 
         System.out.println(" 1. Chicken Burger");
         System.out.println(" 2. Veg Burger");
	 int d=sc.nextInt();
	 if(d==1)
         {
           float bill=bill+200f;
	   System.out.println("chicken burger -----------> "+bill+"/-");
         }
         if(d==2)
         {
           float bill=bill+100f;
	   System.out.println("Veg Burger      -----------> "+bill+"/-");
         }
        }
       }
       static void macdonalds()
       {
	System.out.println(YELLOW+blink+"\n\t\t\t\t\t**WELCOME TO MACDONALDS!!**"+RESET);
	System.out.println("1.Pizza");
        System.out.println("2.Burger");
        int b=sc.nextInt();
        if(b==1)
	{
	  System.out.println("Enter size of pizza!!!");
          System.out.println(" 1. Small ");
	  System.out.println(" 2. Medium");
	  System.out.println(" 3. Large ");
          int c=sc.nextInt();
          if(c==1)
 	  { 
	   float bill=bill+100f;
 	   System.out.println("Small Pizza     ---------> "+bill+"/-");
          }
          else if(c==2)
   	  {
	   float bill=bill+150f;
 	   System.out.println("Medium Pizza    ---------> "+bill+"/-");
    	  }
    	  else if(c==3)
          {
           float bill=bill+200f;
 	   System.out.println("Large Pizza      ---------> "+bill+"/-");
          }
        }
        if(b==2)
	{ 
         System.out.println(" 1. Chicken Burger");
         System.out.println(" 2. Veg Burger");
	 int d=sc.nextInt();
	 if(d==1)
         {
           float bill=bill+200f;
	   System.out.println("chicken burger -----------> "+bill+"/-");
         }
         if(d==2)
         {
           float bill=bill+100f;
	   System.out.println("Veg Burger      -----------> "+bill+"/-");
         }
        }
       }
      static void dominos()
       {
	System.out.println(YELLOW+blink+"\n\t\t\t\t\t*WELCOME TO PIZZAHUT*"+RESET);
	System.out.println("1.Pizza");
        System.out.println("2.Burger");
        int b=sc.nextInt();
        if(b==1)
	{
	  System.out.println("Enter size of pizza!!!");
          System.out.println(" 1. Small ");
	  System.out.println(" 2. Medium");
	  System.out.println(" 3. Large ");
          int c=sc.nextInt();
          if(c==1)
 	  { 
	   float bill=bill+100f;
 	   System.out.println("Small Pizza     ---------> "+bill+"/-");
          }
          else if(c==2)
   	  {
	   float bill=bill+150f;
 	   System.out.println("Medium Pizza    ---------> "+bill+"/-");
    	  }
    	  else if(c==3)
          {
           float bill=bill+200f;
 	   System.out.println("Large Pizza      ---------> "+bill+"/-");
          }
        }
        if(b==2)
	{ 
         System.out.println(" 1. Chicken Burger");
         System.out.println(" 2. Veg Burger");
	 int d=sc.nextInt();
	 if(d==1)
         {
           float bill=bill+200f;
	   System.out.println("chicken burger -----------> "+bill+"/-");
         }
         if(d==2)
         {
           float bill=bill+100f;
	   System.out.println("Veg Burger      -----------> "+bill+"/-");
         }
        }
       }
}
class Login extends Restuarant
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static Login login=new Login();
  	static String RESET = "\u001B[0m";
  	static String RED = "\u001B[31m";
  	static String GREEN = "\u001B[32m";
  	static String YELLOW = "\u001B[33m";
  	static String skblue = "\u001B[36m";
  	static String blink = "\u001B[5m";
  	static String magneta = "\u001B[35m";
   	void login ()
        {
	      System.out.print("Enter Username : ");
              String username=sc.next();
              System.out.print("Enter Password : ");
              String password=sc.next();
                 System.out.println(GREEN+blink+"\n\t\t\t\t\t**login success!**"+RESET);
		 System.out.println("Enter 1 for Pizzahut");
                 System.out.println("Enter 2 for Macdonalds");
                 System.out.println("Enter 3 for Dominos");
                 int a=sc.nextInt();
		 if(a==1)
		 {
		    Pizzahut();
		 }
		 else if(a==2)
		 {
		    macdonalds();
	         }
		 else if(a==3)
		 {
		    Dominos();
		 } 
        }
        void register()		
        {      
	      System.out.println("Enter  Username :");
              String s=sc.next();
              System.out.println("Create Password :");
              String s1=sc.next();
              System.out.println("Enter Your Valid Mobile Number:");
              String a=sc.next();                                                                    
              System.out.println(GREEN+blink+"\n\t\t\t\t\t**REGISTRATION SUCCESS!**"+RESET);
	      login.login();
        } 
}
class User extends Login
{
	static
	{
		System.out.println(skblue+blink+"Welcome to Happy Pizza!!"+RESET);
		System.out.println("1.Login");
		System.out.println("2.Register");
	}
	public static void main(String[]args)
	{
	    User a=new User();
	    int n=sc.nextInt();
            if(n==1)
            {
                  a.login();
            }
	    else if(n==2)
           {
		a.register();
       	   }
      }
}