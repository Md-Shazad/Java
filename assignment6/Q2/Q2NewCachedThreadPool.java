package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q2NewCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main thread starts here.");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            service.execute(new Task());
        }
        service.shutdown();
        System.out.println("Main thread ends here.");

	}

}
