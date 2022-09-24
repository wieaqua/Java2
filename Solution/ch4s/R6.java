class AAA {
    static { // 静态块
        System.out.println("我是 AAA 中的静态块!");
    }
}

public class R6 {
    static { // 静态块
        System.out.println("我是最先被执行的静态块!");
    }

    public static void main(String args[]) {
        AAA a = new AAA(); // AAA 的字节码进入内存
        System.out.println("我在了解静态(static)块");
    }
}