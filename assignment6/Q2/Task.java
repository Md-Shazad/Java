package Q2;

import java.util.concurrent.TimeUnit;


public class Task implements Runnable {
    private static int count = 0;
    private int id;
    Task() {
        this.id = ++count;
    }
    @Override
    public void run() {
        System.out.println("##### <Task-"+id+"> Starting #####");
        for (int i = 10; i > 0; i--) {
            System.out.println("<"+id+"> Tick Tick - "+i);
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("##### <Task-"+id+"> Completed #####");
    }


}
