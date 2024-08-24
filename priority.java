//CJA where we have class like pair which has two variables x and y taking pair as generic to the priority queue object such that they get ordered by y when we print the values. 

import java.util.*;
class Pair
{
    int x;
    String y;
    Pair(int x,String y)
	{
	   this.x=x;
	   this.y=y;
	}
	  public static void main(String[]args)
	   {
	      Scanner sc=new Scanner(System.in);
		PriorityQueue<Pair>p=new PriorityQueue(
		new Comparator<Pair>()
		{
		   public int compare(Pair p1,Pair p2)
			{
			  return -	p1.y.compareTo(p2.y);
			}
		});
	for(int i=1;i<=5;i++)
	{
	   p.add(new Pair(sc.nextInt(),sc.next()));
	}
		for(Pair q:p)
		{
		  System.out.print(q.x+" "+q.y);
		}
	}
} 