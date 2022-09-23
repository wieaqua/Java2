public class Lader {
    double upBott, height; // 上第 高 实例变量
    static double downBott; // 下第 类变量

    void setUp(double a) {
        upBott = a;
    }

    void setDown(double b) {
        downBott = b;
    }

    double getUp() {
        return upBott;
    }

    double getDown() {
        return downBott;
    }
}