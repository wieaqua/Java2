/*
 编写一个应用程序求 100 以内的全部素数。
 */
public class solution3_2 {
    public static void main(String args[]) {
        int i, j;
        for (j = 2; j <= 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0)
                    break;
            }
            if (i > j / 2) {
                System.out.print(j + " ");
            }
        }
    }
}