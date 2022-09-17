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