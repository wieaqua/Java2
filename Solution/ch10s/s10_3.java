import java.io.*;
import java.util.*;

public class s10_3 {
    public static void main(String[] args) {
        File file = new File("p.txt");
        Scanner sc = null;
        int count = 0;
        double sum = 0;
        try {
            double price = 0;
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+");
            while (sc.hasNext()) {
                price = sc.nextDouble();
                count++;
                sum = sum + price;
                System.out.println(price);

            }
        } catch (Exception exp) {
            System.out.println(exp);
        }
        double aver = sum / count;
        System.out.println("平均价格:" + aver);
    }
}