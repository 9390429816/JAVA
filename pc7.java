class RT
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
void m1(int a)
{
System.out.println(a);
}
float m1(String b, float c)
{
System.out.println(b);
System.out.println(c);
return sc.nextFloat();
}
String m1(float d,long e)
{
System.out.println(d);
System.out.println(e);
return sc.next();
}
public static void main(String[]args)
{
RT obj=new RT();
obj.m1(sc.nextInt());
obj.m1(sc.next(),sc.nextFloat());
obj.m1(sc.nextFloat(),sc.nextLong());
}
}

