class A {
    double f(int x, double y) {
        return x + y;
    }

    int f(int x, int y) {
        return x * y;
    }
}

public class R4 {
    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.f(10, 10)); // 代码 1
        System.out.println(a.f(10, 10.0)); // 代码 2
    }
}