//CJA where we need to create object of ArrayList class then add few elements then retrive all the elements which are commom in both the objects,create 3 object for array list class add only integer values then perform addition of all the number and then print the results.


import java.util.*;

class A {
    public static void main(String[] args) 
	{
        ArrayList a1 = new ArrayList();
	a1.add(10);
	a1.add("James");
	a1.add("java");
	a1.add(12.5);
	ArrayList a2 = new ArrayList();
	a2.add(13);
	a2.add("Python");
	a2.add("java");
	a2.add(10);
	a1.retainAll(a2);
	for(Object e:a1)
	{
 	  System.out.println(e);
	}
   	ArrayList<Integer> a3 =new ArrayList<>();
	a3.add(100);
	a3.add(40);
	a3.add(50);
	a3.add(60);
	int sum=0;
	Iterator itr=a3.iterator();
	while(itr.hasNext());
	{
 	int a=(int)itr.next();
	sum=sum+a;
	}
	System.out.println(sum); 
    }
}
