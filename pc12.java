abstract  class A
{
abstract int m1(String a);
abstract float m2(long b);
}
abstract class B extends A
{
B(String a)
{
System.out.println(a);
}
abstract long m3(int c);
abstract float m4(String d);
static java.util.Scanner sc=new java.util.Scanner(System.in);
int m5(short e)
{
System.out.println(e);
return sc.nextInt();
}
}
class C extends B
{
int m1(String a)
{
System.out.println(a);
return sc.nextInt();
}
float m2(long b)
{
System.out.println(b);
return sc.nextFloat();
}
long m3(int c)
{
System.out.println(c);
return sc.nextLong();
}
float m4(String d)
{
System.out.println(d);
return sc.nextFloat();
}
C()
{
super(sc.next());
}
public static void main(String[]args)
{
C a1=new C();
System.out.println(a1.m1(sc.next()));
System.out.println(a1.m2(sc.nextLong()));
System.out.println(a1.m3(sc.nextInt()));
System.out.println(a1.m4(sc.next()));
System.out.println(a1.m5(sc.nextShort()));
}
}
