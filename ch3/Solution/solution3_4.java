public class solution3_4 {
    public static void main(String args[]) {
        int n = 1000, i = 1, sum = 0;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println("完数:" + i);
            }
            sum = 0;
        }
    }

}