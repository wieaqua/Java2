public class Pillar {
    Geometry bottom; // bottom 是抽象类 Geometry 声明的变量
    double height;

    Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolum() {
        if (bottom == null) {
            System.out.println("没有底,无法计算体积");
            return -1;
        }
        return bottom.getArea() * height; // bottom 可以调用子类重写的 getArea 方法
    }
}