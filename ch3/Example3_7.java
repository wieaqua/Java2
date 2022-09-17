public class Example3_7 {
    public static void main(String args[]) {
        int sum = 0, i, j;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum = sum + i; // 计算 1 3 5 7 9 sum
        }
        System.out.println("sum=" + sum);
        for (j = 2; j <= 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0)
                    break;
            }
            if (i > j / 2) {
                System.out.println("" + j + "是素数");
            }
        }
    }
}
