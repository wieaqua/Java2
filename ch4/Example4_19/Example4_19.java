public class Example4_19 {
    public static void main(String args[]) {
        Student zhang = new Student();
        Student geng = new Student();
        zhang.setAge(23);
        System.out.println("zhang 的年龄:" + zhang.getAge());
        geng.setAge(25);
        // zhang.age = 23; 或 geng.age = 25; 都是非法的
        System.out.println("geng 的年龄:" + geng.getAge());
    }
}
