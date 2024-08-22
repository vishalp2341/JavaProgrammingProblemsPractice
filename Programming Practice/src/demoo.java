
class lunch implements Runnable
{
	String resource1 = "tv";
	String resource2 = "remote";
	
	public void run()
	{
		if(Thread.currentThread().getName().equals("ram"))
		{
			ram();
		}
		else
		{
			suresh();
		}
	}
	
	void ram()
	{
			try 
			{
				synchronized(resource1)
				{
				System.out.println("ram acquired tv");
				Thread.sleep(1000);
				
				
				synchronized(resource2)
				{
					System.out.println("ram acquired remote");
					Thread.sleep(1000);
				}
				
			} 
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	void suresh()
	{
			try 
			{
				synchronized(resource2)
				{
				System.out.println("suresh acquired remote");
				Thread.sleep(1000);
				
				
				synchronized(resource1)
				{
					System.out.println("suresh acquired tv");
					Thread.sleep(1000);
				}
				
			} 
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}



public class demoo {

	public static void main(String[] args) {
		
		lunch l = new lunch();
		
		Thread t1 = new Thread(l);
		Thread t2 = new Thread(l);
		
		t1.setName("ram");
		t2.setName("suresh");
		
		t1.start();
		t2.start();
		

	}

}
