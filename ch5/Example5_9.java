// final 类不能被继承
class A {
    final double PI = 3.1415926; // PI 是常量

    public double getArea(final double r) {
        // r = r + 1; // 非法 不允许对 final 变量进行更新操作
        return PI * r * r;
    }

    public final void speak() {
        System.out.println("您好, How's everything here?");
    }
}

public class Example5_9 {
    public static void main(String args[]) {
        A a = new A();
        System.out.println("面积: " + a.getArea(100));
        a.speak();
    }
}