class A {
    public int getNumber(int a) {
        return a + 1;
    }
}

class B extends A {
    public int getNumber(int a) {
        return a + 100;
    }

    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.getNumber(10)); // 代码 1
        a = new B();
        System.out.println(a.getNumber(10)); // 代码 2
    }
}
