class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
int m1(String a)
{
System.out.println(a);
return sc.nextInt();
}
class B
{
long m2(float b)
{
System.out.println(b);
class C
{
C(int d)
{
System.out.println(d);
}
String m3(long e)
{
System.out.println(e);
return sc.next();
}
}
C a1=new C(sc.nextInt());
System.out.println(a1.m3(sc.nextLong()));
return sc.nextLong();
}
}
static class D
{
D(int f, float g)
{
System.out.println(f+" "+g);
}
float m4(int h)
{
System.out.println(h);
return sc.nextFloat();
}
}
public static void main(String[]args)
{
A a1=new A();
System.out.println(a1.m1(sc.next()));
B a2=a1.new B();
System.out.println(a2.m2(sc.nextFloat()));
D a3=new D(sc.nextInt(),sc.nextFloat());
System.out.println(a3.m4(sc.nextInt()));
}
}
