package thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Thread1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	for(int i=0;i<=10;i++)
	{
		System.out.print(i);
		try {
			Thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 t=new Thread1();
Thread1 t2=new Thread1();
t.start();
System.out.println(t.isAlive());
//t.start();
t2.start();
//t.destroy();
//t2.destroy();
System.out.println(t.isAlive());
//t2.interrupt();
//System.out.println(t2.isAlive());
	}
}
