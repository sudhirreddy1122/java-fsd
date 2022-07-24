public class Threadclass extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		Threadclass mt = new  Threadclass();
  		mt.start();
 	}
}
