public class Example7_1 {
    public static void main(String[] args) {
        RedCowForm form = new RedCowForm("红牛农场");
        form.showCowMess();
        form.cow.speak(); // 调用内部类
    }
}