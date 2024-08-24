abstract class A
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
int m1(String a)
{
System.out.println(a);
return sc.nextInt();
}
abstarct String m2(long b);
}
class B extends A
{
String m2(long b)
{
System.out.println(b);
return sc.next();
}
public static void main(String[]args)
{
A a1=new A();
a1.m2(sc.nextLong());
a1.m1(sc.next());
}
}

