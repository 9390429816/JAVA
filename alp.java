class B extends Thread
{
    public void run()
    {
        for(char c='a';c<='z';c++)
        {
            System.out.print(c+" ");
        }
	C.a2.resume();
	for(int i=1;i<=10;i++)
	{
		System.out.print(i+" ");
	}
    }
}
class C extends Thread
{
	public void run()
	{
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
	}
static C a2;
public static void main(String[]args)
	{
		B a1=new B();
		a1.start();
		a2=new C();
		a2.start();
		a2.suspend();
	}
}