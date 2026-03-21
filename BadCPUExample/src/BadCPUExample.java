public class BadCPUExample {

  public static void burnCPU() {
    while (true) {
      double x = Math.random() * Math.random();
    }
  }

  public static void main(String[] args) {

    int threads = 5;

    System.out.println("Starting " + threads + " CPU-burning threads...");

    for (int i = 0; i < threads; i++) {
      new Thread(BadCPUExample::burnCPU).start();
    }
  }
}
