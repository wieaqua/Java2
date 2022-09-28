public class Example5_3 {
    public static void main(String args[]) {
        CheapGoods cheapGoods = new CheapGoods();
        // cheapGoods.weight = 198.98; 非法 子类对象中的 weight 是 int 型
        cheapGoods.newSetWeight(198);
        System.out.println("对象 cheapGoods 的 weight 的值是:" + cheapGoods.weight);
        System.out.println("cheapGoods 用子类新增的优惠方法计算价格: " +
                cheapGoods.newGetPrice());
        cheapGoods.oldSetWeight(198.987); // 子类对象调用继承的方法操作隐藏的 double 型变量 weight
        System.out.println("cheapGoods 使用继承的方法(无优惠)计算价格: " + cheapGoods.oldGetPrice());

    }
}