class XiyoujiRenwu {
    float height, weight;
    String head, ear;

    void speak(String s) {
        head = "歪着头";
        System.out.println(s);
    }
}

public class Example4_3 {
    public static void main(String args[]) {
        XiyoujiRenwu zhubajie, sunwukong; // 声明对象
        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu(); // 为对象分配变量
        zhubajie.height = 1.80f; // 对象给自己的变量赋值
        zhubajie.head = "大头";
        zhubajie.ear = "一双大耳朵";
        sunwukong.height = 1.62f;
        sunwukong.weight = 1000f;
        sunwukong.head = "秀发飘飘";
        System.out.println("zhubajie 的身高:" + zhubajie.height);
        System.out.println("zhubajie 的头:" + zhubajie.head);
        System.out.println("sunwukong 的重量:" + sunwukong.weight);
        System.out.println("sunwukong 的头:" + sunwukong.head);
        zhubajie.speak("俺老猪我想娶媳妇");
        System.out.println("zhubajie 现在的头:" + zhubajie.head);
        sunwukong.speak("老孙我重 1000 斤,我想骗八戒背我");
        System.out.println("sunwukong 现在的头:" + sunwukong.head);
    }
}