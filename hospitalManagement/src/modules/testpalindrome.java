package modules;

public class testpalindrome 
{
	int b=0;
	int n=0;
	public int checkPalindrome(int a)
	{
		b=a;
		while(b>0)
		{
			n=(n*10)+(b%10);
			b=b/10;
		}
		return n;
	}
}
