abstract class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
abstract int m1(float a);
public static void main(String[]args)
{
A a1=new A()
{
int m1(float a)
{
System.out.println(a);
return sc.nextInt();
}
};
System.out.println(a1.m1(sc.nextFloat()));
}
}

