class RedCowForm {
    static class RedCow { // 静态内部类是外嵌类中的一种静态数据类型
        void speak() {
            System.out.println("我是红牛");
        }
    }
}

public class BlackCowForm {
    public static void main(String[] args) {
        RedCowForm.RedCow red = new RedCowForm.RedCow();
        // 如果 RedCow 不是静态内部类，此代码非法
        red.speak();
    }
}