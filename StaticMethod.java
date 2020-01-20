class StaticMethod
{
	static int num;//static variable
	int c;//non-static or instance variable
	
      static void setstatic(int a)
	{
	num=a;
	System.out.println(num);
	}
      void setnonstatic()
	{
	System.out.println(num);
	}
	public static void main(String args[])
	{
      setstatic(10);
         StaticMethod s=new StaticMethod();
	    s.setnonstatic();
	}
}

