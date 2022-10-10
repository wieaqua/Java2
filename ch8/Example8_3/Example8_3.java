import java.util.*;

public class Example8_3 {
    public static void main(String[] args) {
        String[] a = { "melon", "apple", "pear", "banana" };
        String[] b = { "西瓜", "苹果", "梨", "香蕉" };
        System.out.println("使用 SortString 类的方法按字典序排列数组 a:");
        SortString.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }
        System.out.println("");
        System.out.println("使用类库中的 Arrays 类, 按字典序排列数组 b:");
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(" " + b[i]);
        }
    }
}