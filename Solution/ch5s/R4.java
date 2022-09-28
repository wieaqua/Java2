class A {
    int m;

    int getM() {
        return m;
    }

    int seeM() {
        return m;
    }
}

class B extends A {
    int m;

    int getM() {
        return m + 100;
    }
}

public class R4 {
    public static void main(String args[]) {
        B b = new B();
        b.m = 20;
        System.out.println(b.getM()); // 代码 1
        // 120
        A a = b;
        a.m = -100; // 上转型对象访问的是被隐藏的 m
        System.out.println(a.getM()); // 代码 2 上转型对象调用的一定是子类重写的 getM
        System.out.println(b.seeM()); // 代码 3 子类继承的 seeM() 方法操作的是 m 是被子类隐藏的 m
    }
}