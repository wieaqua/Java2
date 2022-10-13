public class Goods {
    String name;
    double price;

    Goods(String n, double p) {
        name = n;
        price = p;
    }

    public String toString() {
        return name; // 返回对象的串表示
    }
}