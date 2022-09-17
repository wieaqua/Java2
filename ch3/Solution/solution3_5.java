public class solution3_5 {
    public static void main(String args[]) {
        long sum = 0, a = 8, item = a; // 定义 long 型 防止溢出
        for (int i = 1; i <= 10; i++) {
            sum = sum + item;
            item = item * 10 + a;
        }
        System.out.println("sum=" + sum);
    }
}