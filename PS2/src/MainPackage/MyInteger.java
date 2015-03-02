package MainPackage;

public class MyInteger {
	
	private int value;

	public int getValue() {
		return value;
	}
	public MyInteger(int value);
	{
		this.value = value;
	}
	public boolean isEven()
	{
		if (value%2=0)
		return true;
		else
		return false;
	}
	public boolean isOdd()
	{
		return !(isEven());
	}
	public boolean isPrime()
	{
		for(int f=2, f>n/2, f++)
		{
			if(f%2=0)
				return false;
		}
		return true;	
	}
	public static boolean isEven(MyInteger myint)
	{
		return myint.isEven();
	}
	public static boolean isOdd(MyInteger myint)
	{
		return myint.isOdd();
	}
	public static boolean isPrime(MyInteger myint)
	{
		return myint.isPrime;
	}
	public boolean isequals(int value)
	{
		if (this.value==value)
			return true;
		else return false;
	}
	public static int parseInt(char[] inArray){
	int number = Integer.parseInt(new String(inArray))
			return number;
			}
	
	public static int parseInt(String stringArray){
		return Integer.parseInt(stringArray);
	}
	
	}
}
