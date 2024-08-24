class A 
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
int x=sc.nextInt();
String m1(float a)
{
System.out.println(a);
return sc.next();
}
A(long a)
{
System.out.println(a);
}
}
class B extends A
{
float x=sc.nextInt();
String m1(float a)
{
System.out.println(a);
System.out.println(x);
System.out.println(super.x);
System.out.println(super.m1(sc.nextFloat()));
return sc.next();
}
B()
{
super(sc.nextLong());
System.out.println("default");
}
public static void main(String[]args)
{
B obj =new B();
System.out.println(obj.m1(sc.nextFloat()));
}
}
