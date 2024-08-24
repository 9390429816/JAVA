abstract class pay
{
abstract void payment(float a);
}
class Gpay extends pay
{
void payment(float a)
{
System.out.println("transcation successful using Gpay");
}
}
class ppay extends pay
{
void payment(float a)
{
System.out.println("transcation successful using ppay");
}
}
class test 
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
static void display(pay p1)
{
p1.payment(sc.nextFloat());
}
public static void main(String[]args)
{
System.out.println("To do transaction using Gpay enter 1");
System.out.println("To do transaction using ppay enter 2");
int option=sc.nextInt();
pay p;
if(option==1)
{
p=new Gpay();
display(p);
}
else if(option==2)
{
p=new ppay();
display(p);
}
}
}
