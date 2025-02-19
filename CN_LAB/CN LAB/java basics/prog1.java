class test
{
	public static void main(String ar[])
	{
		int a=5,i;
		fibon f1=new fibon();
		for(i=0;i<=a;i++){
			System.out.println(f1.fibo(i));
		}
	}
}
class fibon
{
	int fibo(int n)
	{
		if (n<=1){
			return n;
		}
		else{
			return fibo(n-1)+fibo(n-2);
		}
	}	
}