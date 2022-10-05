public class Example6_1 {
    public static void main(String[] args) {
        China zhang;
        Japan henlu;
        zhang = new China();
        henlu = new Japan();
        zhang.number = 32 + Computable.MAX; // 用接口名访问接口的常量
        henlu.number = 14 + Computable.MAX;
        System.out.println("zhang 的学号" + zhang.number + ", zhang 求和结果" +
                zhang.f(100));
        System.out.println("henlu 的学号" + henlu.number + ", henlu 求和结果" +
                henlu.f(100));
    }
}