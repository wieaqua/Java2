import java.util.*;

public class solution7_4 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        // boolean judge;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            // assert (x <= 100 || x > 0) : "成绩错误";
            assert x < 100 : "成绩错误";
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d 个数的和为 %f\n", m, sum);
        System.out.printf("%d 个数的平均值是 %f\n", m, sum / m);
        reader.close();
    }
}
