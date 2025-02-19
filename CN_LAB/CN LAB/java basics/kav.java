class Test1
{
	int a,b,c;
	void m1()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
class Test
{
	public static void main(String ar[])
	{
		System.out.println("welcome");
		Test1 t1=new Test1();
		t1.m1();
	}
}