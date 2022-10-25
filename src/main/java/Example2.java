
public class Example2 {

    private void emptySynchronized() {
        synchronized (this) {
            // Forgot implementation
        }
    }

    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(5000);
        }
    }
}