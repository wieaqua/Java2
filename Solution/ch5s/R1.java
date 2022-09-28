class A {
    double f(double x, double y) {
        return x + y;
    }
}

class B extends A {
    double f(int x, int y) {
        return x * y;
    }
}

public class R1 {
    public static void main(String args[]) {
        B b = new B();
        System.out.println(b.f(3, 5)); // 代码 1
        System.out.println(b.f(3.0, 5.0)); // 代码 2
    }
}