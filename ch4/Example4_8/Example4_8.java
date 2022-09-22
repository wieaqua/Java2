public class Example4_8 {
    public static void main(String args[]) {
        Circle circle = new Circle(); // code1
        circle.setRadius(10); // code2
        Circular circular = new Circular(); // code3
        System.out.println("circle 的引用:" + circle);
        System.out.println("圆锥的 bottom 的引用:" + circular.bottom);
        circular.setHeight(5);
        circular.setBottom(circle); // code4
        System.out.println("circle 的引用:" + circle);
        System.out.println("圆锥的 bottom 的引用:" + circular.bottom);
        System.out.println("圆锥的体积:" + circular.getVolme());
        System.out.println("修改 circle 的半径, bottom 的半径同样变化");
        circle.setRadius(20); // code5
        System.out.println("bottom 的半径:" + circular.getBottomRadius());
        System.out.println("重新创建 circle, circle 的引用将发生变化");
        circle = new Circle(); // 重新创建 circle code6
        System.out.println("circle 的引用:" + circle);
        System.out.println("但是不影响 circular 的 bottom 的引用");
        System.out.println("圆锥的 bottom 的引用:" + circular.bottom);

    }
}