// for 计算 1 + 1/2! + 1/3! + … 的前 20 项和

public class solution3_3b {
    public static void main(String args[]) {
        double sum = 0;
        long item = 1;
        for (int i = 2; i <= 20; i++) {
            sum = sum + (1.0 / item);
            item = item * i;
        }
        System.out.println("for");
        System.out.println("sum=" + sum);
    }
}
