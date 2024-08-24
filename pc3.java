class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
int m1(String a)
{
System.out.println(a);
}
float m2(int b)
{
System.out.println(b);
}
long m3(float c)
{
System.out.printf(c);
}
class B
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
static A a1=new A();
String m4(int b)
{
System.out.println("b");
return sc.next();
}
float m5(String b)
{
System.out.println(b);
System.out.println(a1.m2(sc.nextInt()));
return sc.nextFloat();
}
String m6(float b)
{
System.out.println(b);
System.out.println(a1.m3(sc.nextFloat()));
return sc.next();
}
}
public static void main(String[]args)
{
B obj1=new B();
System.out.println(obj1.m5(sc.next());
System.out.println(obj1.m6(sc.nextFloat()));
}

