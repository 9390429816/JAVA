class A
{
static java.util.Scanner sc=new java.util.0.Scanner(System.in);
A(int a)
{
System.out.println(a);
}
A(String b,float c)
{
System.out.println(b);
System.out.println(c);
}
A(float d,int e,String f)
{
System.out.println(d);
System.out.println(e);
System.out.println(f);
}
public static void main(String[]args)
{
A obj1=new A(sc.nextInt());
A obj2=new A(sc.next(),sc.nextFloat());
A obj3=new A(sc.nextFloat(),sc.nextInt(),sc.next());
}
}
