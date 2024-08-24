class C
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
int x=sc.nextInt();
void m1(float x)
{
System.out.println(x);
System.out.println(this.x);
}
long m1(String a)
{
System.out.println(a);
this.m1(sc.nextFloat());
return sc.nextLong();
}
C(int a)
{
System.out.println(a);
}
C(String a)
{
this(sc.nextInt());
System.out.println(a);
}
}
class D extends C
{
String x=sc.next();
long m1(String a)
{
System.out.println(a);
System.out.println(x);
System.out.println(super.x);
System.out.println(super.m1(sc.next()));
return sc.nextLong();
}
D()
{
super(sc.next());
}
public static void main(String[]args)
{
D obj =new D();
System.out.println(sc.next());
}
}