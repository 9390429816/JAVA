// CJA where we need to create object of ArrayList class then add elements which is of only integer, create second object for ArrayList then add few elements including previous object elements then display all the elements,remove few elements, check whether a number is available or not.


import java.util.*;
class A
{
    public static void main(String[]args)
       {
          ArrayList<Integer> list= new ArrayList<>();
	  for(int i=1;i<=5;i++)
	{
	list.add(i);
	}
	ArrayList<Integer> list2=new ArrayList<>();
	list2.addAll(list);s
	System.out.println(list2);
	list2.add((Object)5);
	System.out.println(list2);
	System.out.println(list2.contains((Object)5));
	}
}