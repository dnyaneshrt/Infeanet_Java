class HelloTest
{
	int num=100;//instance variables
	static int num=100;
	HelloTest()
	{
		int num=100;//local variable
	}
	{
		//local variable
		int num=100;
	}
	static{
		//local variable
		int num=100;
	}
public static void main(String[] args)
{
//local variable
	int num=100;
}
}
//compiled successfully.   class file got generated.  ByteCode(PI)
