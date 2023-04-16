public class Main {

   public static final int numSorts = 10;
   public static final int maxThreads = 8;

   public static void main(String[ ] args) {

      WorkQueue wq = new WorkQueue();

      int sortSize = 3200;
      for (int i=0; i<numSorts; i++) {
         wq.put(new QuickSort(sortSize));
         wq.put(new DotProduct(sortSize));
         sortSize *= 2;
      }


      Thread[ ] workers = new Thread[maxThreads];

      long startTime = System.nanoTime( );

      for (int threadNum = 0; threadNum < maxThreads; threadNum++) {
         workers[threadNum] = new Thread(new WorkThread(wq));
         workers[threadNum].start( );
      }

      for (int threadNum = 0; threadNum < maxThreads; threadNum++) {
         try {
            workers[threadNum].join( );
         } catch (InterruptedException e) {e.printStackTrace( );}
      }

      long endTime = System.nanoTime( );
      System.out.println("time taken with "+ maxThreads + " threads is "+ (endTime-startTime)/100000. +" milliseconds");



   }
}
