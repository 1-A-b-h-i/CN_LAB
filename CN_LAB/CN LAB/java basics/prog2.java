class test
{
	public static void main(String ar[])
	{
		int a=5,i;
		fact f1=new fact();
		System.out.println(f1.fact(a));
		
	}
}
class fact
{
	int fact(int n)
	{
		int r=1;
		for(int i=2;i<=n;i++){
			r=r*i;
		}
		return r; 
	}
}