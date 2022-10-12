public class Example8_13 {
    public static void main(String[] args) {
        String cost = "市话: 76.8 元, 长途: 167.38 元, 短信: 12.68 元";
        double priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n总价:%.2f 元\n", cost, priceSum);
        cost = "牛奶:8.5 元,香蕉:3.6 元, 酱油:2.8 元";
        priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n总价:%.2f 元\n", cost, priceSum);
    }
}