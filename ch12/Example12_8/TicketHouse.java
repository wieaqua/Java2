public class TicketHouse implements Runnable {
    int fiveAmount = 2, tenAmount = 0, twentyAmount = 0;

    public void run() {
        if (Thread.currentThread().getName().equals("张飞")) {
            saleTicket(20);
        } else if (Thread.currentThread().getName().equals("李逵")) {
            saleTicket(5);
        }
    }

    public synchronized void saleTicket(int money) {
        if (money == 5) {
            fiveAmount += 1;
            System.out.println("给" + Thread.currentThread().getName() +
                    "入场劵," + Thread.currentThread().getName() + "的钱正好");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println("\n" + Thread.currentThread().getName() +
                            "靠边等...");
                    wait();
                    System.out.println("\n" + Thread.currentThread().getName() +
                            "继续买票");
                } catch (InterruptedException e) {
                }
            } // while

            fiveAmount -= 3;
            twentyAmount += 1;
            System.out.println("给" + Thread.currentThread().getName() + "入场劵," +
                    Thread.currentThread().getName() + "给 20, 找赎 15 元");
        } // endif

        notifyAll();
    }
}