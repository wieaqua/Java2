interface A {
    double f(double x, double y);
}

class B implements A {
    public double f(double x, double y) {
        return x * y;
    }

    int g(int a, int b) {
        return a + b;
    }
}

public class R1 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f(3, 5)); // 代码 1 15.0
        B b = (B) a;
        System.out.println(b.g(3, 5)); // 代码 2 8
    }
}