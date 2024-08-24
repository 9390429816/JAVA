//CJA where we need to create object of ArrayDeque class add elements into this object ,create second object for array deque class,add elements from previous object,add and remove elements,then display all the values.. 

import java.util.*;
public class ADQ 
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 ArrayDeque<Integer> ad =new ArrayDeque<>(ad);
	 for(int i=0;i<3;i++)
	 {
		 ad.add(sc.nextInt());
	 }
	 ArrayDeque<Integer> ad2 =new ArrayDeque<>(ad2);
	 for(int i=0;i<3;i++)
	 {
		 ad2.add(sc.nextInt());
	 }
	 sc.close();
	 ad2.removeFirst();
	 for(int i:ad2)
	 {
		 System.out.print(i+" ");
	 }
 }
	
}
