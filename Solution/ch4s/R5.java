public class R5 {
    public static void main(String args[]) {
        f(1, 2);
        f(-1, -2, -3, -4); // 给参数传值时，实参的个数很灵活
        f(9, 7, 6);
    }

    public static void f(int... x) { // x 是可变参数的代表，代表若干个 int 参数
        for (int i = 0; i < x.length; i++) { // x.length 是 x 代表的参数个数
            System.out.println(x[i]); // x[i] 是 x 代表的第 i 个参数 类似数组
        }
    }
}