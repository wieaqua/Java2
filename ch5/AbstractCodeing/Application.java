public class Application {
    public static void main(String args[]) {
        Pillar pillar;
        Geometry bottom = null;
        pillar = new Pillar(bottom, 100);
        System.out.println("体积" + pillar.getVolum());
        bottom = new Rectangle(12, 22);
        pillar = new Pillar(bottom, 58); // pillar 是具有矩形底的柱体
        System.out.println("体积" + pillar.getVolum());
        bottom = new Circle(10);
        pillar = new Pillar(bottom, 58); // pillar 是具有圆形底的柱体
        System.out.println("体积" + pillar.getVolum());
    }
}