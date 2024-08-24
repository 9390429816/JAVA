class Pay
{
void payment (String upiid, float amount){
} 
void payment (long phonenumber, float amount){
} 
}
class Gpay extends Pay{
 static float balance=10000;
void payment (String upiid, float amount){
balance=balance-amount; 
System.out.println("transaction successful");
} 
void payment (long phonenumber, float amount){
 balance=balance-amount; 
System.out.println("transaction successful");
}
}
class PhonePe extends Pay{ 
static float balance=10000;
void payment(String upiid, float amount){ 
balance=balance-amount;
System.out.println("transaction successful");
}

void payment (long phonenumber, float amount){ 
balance=balance-amount; 
System.out.println("transaction successful");
 }
class User{

public static void main(String[]agrs)
{ 
System.out.println("To do transaction by using Gpay enter 1"); 
System.out.println("To do transaction by using PhonePe enter 2"); 
java.util.Scanner sc=new java.util.Scanner(System.in);
int option=sc.nextInt(); 
String upiid;
string phonenumber; 
if(option==1)
{
Gpay gpay=new Gpay();
System.out.println("To do transaction by using upiid enter 1"); 
System.out.println("To do transaction by using phonenumber enter 2");
int option2=sc.nextInt();
if(option2==1){
System.out.println("enter upiid and amount"); 
gpay.payment (sc.next(), sc.nextFloat());
}
else if (option2==2)
{
gpay.payment (sc.nextLong(),sc.nextFloat());
}
else if(option==2)
{
PhonePe p= new PhonePe();
System.out.println("To do transaction by using upiid enter 1"); 
System.out.println("To do transaction by using phonenumber enter 2"); 
int option2=sc.nextInt();
if (option2==1)
{
p.payment (sc.next(), sc.nextFloat());

} 
else if(option2==2){
p.payment (sc.nextLong(), sc.nextFloat());
}
}
}

