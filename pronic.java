import java.util.*;
class A
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,p1=1,p2=1;
        for(int i=0;p<n;i++)
        {
            p1=i;
            p2=i+1;
            p=p1*p2;
        }
        if(p==n&&(p2-p1==1))
        {
            System.out.print("pronic number");
        }
        else
        System.out.print("not a pronic number");
    }
}