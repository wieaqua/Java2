/*
 编写应用程序求 1!+2!+…+10!
 */
public class solution3_1 {
    public static void main(String args[]) {

        long sum = 0, item = 1;
        for (int i = 2; i <= 10; i++) {
            sum += item;
            item = item * i;
        }
        System.out.println(sum);
    }
}