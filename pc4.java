class A
{
private int a=10;
private int b=20;
void seta(int a)
{
this.a=a;
}
void setb(int b)
{
this.b=b;
}
int geta()
{
return a;
}
int getb()
{
return b;
}
}
class B
{
public static  void main(string args[])
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
A obj=new A();
obj.seta(sc.nextInt());
obj.setb(sc.nextInt());
System.out.println(obj.geta());
System.out.pritnln(obj.getb());
}
}