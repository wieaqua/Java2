// do-while 
public class solution3_3a {
    public static void main(String args[]) {
        double sum = 0;
        int n = 20, i = 2; // i 从 2 开始累加
        long item = 1;
        do {
            sum = sum + (1.0 / item);
            item = item * i;
            i++;
        } while (i <= n);
        System.out.println("do-while");
        System.out.println("sum=" + sum);
    }
}