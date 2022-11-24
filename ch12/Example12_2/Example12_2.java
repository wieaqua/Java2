public class Example12_2 {
    public static void main(String[] args) {
        Thread speakElephant;
        Thread speakCar; // 用 Thread 声明线程
        ElephantTarget elephant;
        CarTarget car;
        elephant = new ElephantTarget();
        car = new CarTarget();
        speakElephant = new Thread(elephant);
        speakCar = new Thread(car); // 创建线程
        speakElephant.start();
        speakCar.start(); // 启动线程
        for (int i = 1; i <= 15; i++) {
            System.out.print("主人" + i + " ");
        }
    }
}