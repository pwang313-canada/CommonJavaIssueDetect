import java.util.ArrayList;
import java.util.List;

interface Listener {
  void onEvent();
}

class EventSource {
  private final List<Listener> listeners = new ArrayList<>();

  public void addListener(Listener listener) {
    listeners.add(listener);
  }

  public void fireEvent() {
    for (Listener l : listeners) {
      l.onEvent();
    }
  }
}

class MyComponent {
  private final EventSource source;

  public MyComponent(EventSource source) {
    this.source = source;

    // ❌ Register listener
    source.addListener(() -> {
      System.out.println("Event received: " + this);
    });
  }
}

public class ListenerLeak {

  public static void main(String[] args) throws Exception {
    EventSource source = new EventSource();

    int i = 0;
    while (true) {
      // Create new objects continuously
      new MyComponent(source);

      System.out.println("Created component: " + i++);

      Thread.sleep(100);
    }
  }
}