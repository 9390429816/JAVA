// CJA where we need to create object for array list class then add different types of values and retrive the valuesin forward direction then remove few values and retrive the elements again



import java.util.*;

class A
{
    public static void main(String[] args) 
    {
        ArrayList a1= new ArrayList();
        a1.add("String");
        a1.add(123);
        a1.add(3.14);
        a1.add(true);
        Iterator itr = a1.iterator();
        while (itr.hasNext()) 
	{
            System.out.println(itr.next());
        }
	a1.remove(true);
	a1.remove("String");
	for(Object O:a1)
	{
	System.out.println(O);
	}
    }
}
