package test;

public class Thread {
	public static void main (String [] args)
	   {
	      MyThread mt = new MyThread ();
	      mt.start();
	      for (int count = 20, row = 1; row < 20; row++, count--)
			{
				for (int i = 0; i < count; i++)
					System.out.print ('+');
				System.out.print ('\n');
			}
	}
}
class MyThread extends Thread
{
	public void start()
	{
		for (int count = 1, row = 1; row < 20; row++, count++)
		{
			for (int i = 0; i < count; i++)
				System.out.print ('*');
			System.out.print ('\n');
		}
	}
}

