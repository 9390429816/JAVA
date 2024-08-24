class Gmail
{
static java.util.Scanner sc=new java.util.Scanner(System.in);
private String uname=sc.next();
private String pass=sc.next();
void setUname(String uname)
{
this.uname=uname;
}
void setPass(String pass)
{
this.pass=pass;
}
String getUname()
{
return uname;
}
String getPass()
{
return pass;
}
}
class user
{
public static void main(String[]args)
{
Gmail obj=new Gmail();
obj.setUname(Gmail.sc.next());
obj.setPass(Gmail.sc.next());
System.out.println(obj.getUname());
System.out.println(obj.getPass());
}
}