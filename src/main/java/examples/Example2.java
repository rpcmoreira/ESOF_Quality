package examples;

public class Example2 {

    public static void main(String[] args) {
        sleepInSynchronized();
        emptySynchronized();
    }

    private void emptySynchronized() {
        synchronized (this) {
            exit(-1);
        }
    }

    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(2000);
        }
    }
}