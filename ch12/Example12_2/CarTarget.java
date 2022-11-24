public class CarTarget implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("轿车" + i + " ");
        }
    }
}