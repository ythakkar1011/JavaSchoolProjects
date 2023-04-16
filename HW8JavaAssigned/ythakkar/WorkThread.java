public class WorkThread implements Runnable{
    static WorkQueue wq;
    private static Object lock = new Object();

    public WorkThread(WorkQueue _wq){
        wq = _wq;
    }

    @Override
    public void run (){
        Command use = wq.get();
        while(use != null){
            use.execute();
            synchronized (lock) {
                System.out.println(use.identify());
            }
            use = wq.get();
        }
    }
}
