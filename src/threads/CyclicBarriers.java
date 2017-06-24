package threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarriers {

    static CyclicBarrier barrier;

    public static void main(String[] args) throws InterruptedException {
        barrier = new CyclicBarrier(3);

        Worker worker = new Worker();

        new Thread().start();
        Thread.sleep(1000);
        new Thread().start();
        Thread.sleep(1000);
        new Thread().start();
        Thread.sleep(1000);

        System.out.println("After 3 threads started");

        new Thread().start();
        Thread.sleep(1000);
        new Thread().start();
        Thread.sleep(1000);
        new Thread().start();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            try {
                CyclicBarriers.barrier.await();
                System.out.println("Finished waiting");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
