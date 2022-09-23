public class Example4_14People {
    int leg, hand;
    String name;

    Example4_14People(String s) {
        name = s;
        this.init(); // 可以省略 this
    }

    void init() {
        leg = 2;
        hand = 2;
        System.out.println(name + "有" + hand + "只手" + leg + "条腿");
    }

    public static void main(String args[]) {
        Example4_14People boshi = new Example4_14People("布什");
    }
}

/*
 * 书上源码
 * public class People {
 * int leg, hand;
 * String name;
 * People(String s) {
 * name = s;
 * this.init(); // 可以省略 this
 * }
 * 
 * void init() {
 * leg = 2;
 * hand = 2;
 * System.out.println(name + "有" + hand + "只手" + leg + "条腿");
 * }
 * 
 * public static void main(String args[]) {
 * People boshi = new People("布什");
 * }
 * }
 * 
 */