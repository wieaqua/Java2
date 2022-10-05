public class China implements Computable { // china 类实现 Computable 接口
    int number;

    public int f(int x) { // 不要忘记 public 关键字
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }
}