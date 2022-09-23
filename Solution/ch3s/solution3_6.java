//编写应用程序，输出满足 1+2+3+…+n < 8888 的最大正整数 n

public class solution3_6 {
    public static void main(String args[]) {
        int n = 8888, sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (sum < n);
        System.out.println("满足条件的最大整数:" + (i - 1));
    }

}