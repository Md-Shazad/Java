package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Class to implement newSingleThreadExecutor.
public class Q2SingleThreadExecuterExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts here.");
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 6; i++) {
            service.execute(new Task());
        }
        service.shutdown();
        System.out.println("Main thread ends here.");
    }
}
