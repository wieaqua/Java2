// 3.4

public class E3_4 {
    public static void main(String args[]) {
        long[] a = { 1, 2, 3, 4 };
        long[] b = { 100, 200, 300, 400, 500 };
        b = a;
        System.out.println("数组 b 的长度:" + b.length); // 代码1
        System.out.println("b[0]=" + b[0]); // 代码2
    }
}
