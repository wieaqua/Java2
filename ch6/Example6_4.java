interface ComputerAverage {
    public double average(double a, double b);
}

class A implements ComputerAverage {
    public double average(double a, double b) {
        double aver = 0;
        aver = (a + b) / 2;
        return aver;
    }
}

class B implements ComputerAverage {
    public double average(double a, double b) {
        double aver = 0;
        aver = Math.sqrt(a * b);
        return aver;
    }
}

public class Example6_4 {
    public static void main(String[] args) {
        ComputerAverage computer;
        double a = 11.23, b = 22.78;
        computer = new A();
        double result = computer.average(a, b);
        System.out.printf("%5.2f 和 %5.2f 的算数平均值:%5.2f\n", a, b, result);
        computer = new B();
        result = computer.average(a, b);
        System.out.printf("%5.2f 和 %5.2f 的几何平均值:%5.2f\n", a, b, result);
    }
}