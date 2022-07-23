public class sleepandwait 
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is  after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is  after" + " waiting for 1 second");
        }
    }
}
