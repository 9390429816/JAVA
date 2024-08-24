abstract class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
abstract String m1(long b);
int m2(String a)
{
System.out.println(a);
return sc.nextInt();
}
}
class B extends A
{
String m1(long b)
{
System.out.println(b);
return sc.next();
}
public static void main(String[]args)
{
B a1=new B();
System.out.println(a1.m1(sc.nextLong()));
System.out.println(a1.m2(sc.next()));
}
}

