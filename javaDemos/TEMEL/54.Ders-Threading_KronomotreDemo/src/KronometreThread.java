public class KronometreThread implements Runnable //thread için gerekli
{
    private Thread thread;
    private String _threadName;

    public KronometreThread(String threadName)
    {
        _threadName=threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }

    @Override
    public void run()
    {
        System.out.println("Çalıştırılıyor: " + _threadName);
        for(int i = 1; i <= 10; i++)
        {

            try
            {
                System.out.println(_threadName + " : " + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Kesildi: " + _threadName);
            }
        }
        System.out.println("Thread bitti: " + _threadName);
    }

    public void start()
    {
        System.out.println("Thread nesnesi oluşturuluyor");
        if (thread == null)
        {
            thread = new Thread(this,_threadName);
            thread.start();
        }
    }
}






