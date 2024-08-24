abstract class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
float m1(int b)
{
System.out.println(b);
return sc.nextFloat();
}
}
class B extends A
{
float m1(int b)
{
System.out.println(b);
System.out.println(this.m1(sc.nextInt()));
return sc.nextFloat();
}
public static void main(String[]args)
{
B a1=new B();
System.out.println(a1.m1(sc.nextInt()));
}
}