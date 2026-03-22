import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalLeak {

  private static final ThreadLocal<byte[]> threadLocal = new ThreadLocal<>();

  public static void main(String[] args) {

    ExecutorService executor = Executors.newFixedThreadPool(5);

    while (true) {
      executor.submit(() -> {
        // Allocate 1MB per task
        byte[] data = new byte[1024 * 1024];

        // Store in ThreadLocal
        threadLocal.set(data);

        // ❌ NEVER REMOVED
        System.out.println("Stored data in ThreadLocal");
      });

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}