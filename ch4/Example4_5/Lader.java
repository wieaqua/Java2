public class Lader {
    double above; // 梯形上底
    double bottom; // 梯形下底
    double height; // 梯形的高

    double getArea() {
        return (above + bottom) * height / 2;
    }
}
