package examples;

public class Example2 {

    public static void main(String[] args) {
        sleepInSynchronized();
    }

    private void emptySynchronized() {
        synchronized (this) {
            exit(-1);
        }
    }
}