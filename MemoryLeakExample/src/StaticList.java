import java.util.ArrayList;
import java.util.List;

public class StaticList {

  // Static list → lives for entire app lifecycle
  private static final List<byte[]> cache = new ArrayList<>();

  public static void main(String[] args) {

    while (true) {
      // Allocate 1MB each loop
      byte[] data = new byte[1024 * 1024];
      cache.add(data);

      System.out.println("Added 1MB, cache size: " + cache.size());

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}