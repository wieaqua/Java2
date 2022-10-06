interface ShowMessage {
    void showBrand(String s); // 显示商标
}

class TV implements ShowMessage {
    public void showBrand(String s) {
        System.out.println(s);
    }
}

class PC implements ShowMessage {
    public void showBrand(String s) {
        System.out.println(s);
    }
}

public class Example6_2 {
    public static void main(String[] args) {
        ShowMessage sm; // 声明接口变量
        sm = new TV(); // 接口变量重存放对象的引用
        sm.showBrand("长城牌电视机"); // 接口回调
        sm = new PC();
        sm.showBrand("联想奔月 5008PC 机");
    }
}