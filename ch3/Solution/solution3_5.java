// 编写应用程序，使用 for 循环语句计算 8+88+888+… 前 10 项之和
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