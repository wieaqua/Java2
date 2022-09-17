public class Example3_8 {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4 };
        char b[] = { 'a', 'b', 'c', 'd' };
        for (int n = 0; n < a.length; n++) {
            System.out.println(a[n]); // 传统方式
        }
        for (int n = 0; n < b.length; n++) {
            System.out.println(b[n]); // 传统方式
        }
        for (int i : a) {
            System.out.println(i); // 循环变量 i 依次取数组 a 的每一个元素的值 改进方式
        }
        for (char ch : b) {
            System.out.println(ch); // 循环变量 ch 依次取数组 b 的每一个元素的值 改进方式
        }
    }
}
