import java.util.*;
class A
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int Ac=0,sum=0;
	int c=0;
	for(int i=a+1;i<b;i++)
	{
	   int fc=0;
	   for(int j=2;j<=(int)Math.sqrt(i);j++)
	    {
	  	  if(i%j==0)
		{
	  	  fc++;
		}
	    }
	if(fc==0&&i>1)
	{
	   Ac++;
	   if(Ac%2==1)
		{
			c++;
			sum=sum+i;
		}

	}
	}
	float Avg=(float)sum/c;
	System.out.printf("%.2f",Avg);
}
}

