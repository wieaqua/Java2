public class Example4_7 {
    public static void main(String args[]) {
        Battery nanfu = new Battery(100); // 创建电池对象
        System.out.println("南孚电池的储电量是:" + nanfu.electricityAmount);
        Radio radio = new Radio(); // 创建收音机对象
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu); // 打开收音机
        System.out.println("目前南孚电池的储电量是:" + nanfu.electricityAmount);
    }

}
