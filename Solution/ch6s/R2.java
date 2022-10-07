interface Com {
    int add(int a, int b);
}

abstract class A {
    abstract int add(int a, int b);
}

class B extends A implements Com {
    public int add(int a, int b) {
        return a + b;
    }
}

public class R2 {
    public static void main(String[] args) {
        B b = new B();
        Com com = b;
        System.out.println(com.add(12, 6)); // 代码 1 18
        A a = b;
        System.out.println(a.add(10, 5)); // 代码 2 15
    }
}