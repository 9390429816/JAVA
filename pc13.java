class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
A(int a)
{
System.out.println(a);
}
float m1(String b)
{
System.out.println(b);
return sc.nextFloat();
}
}
abstract class B extends A
{
B(float e)
{
System.out.println(e);
}
abstract int m2(String d);
long m3(int d)
{
System.out.println(d);
return sc.nextLong();
}
}
class C extends B
{
int m2(String d)
{
System.out.println(d);
return sc.nextInt();
}
C()
{
super(sc.nextFloat());
}
public static void main(String[]args)
{
C a1=new C();
System.out.println(a1.m2(sc.next()));
System.out.println(a1.m1(sc.next()));
System.out.println(a1.m3(sc.nextInt()));
}
}
