public class Example4_10 {
    public static void main(String args[]) {
        Lader.downBott = 100;
        Lader laderOne = new Lader();
        Lader laderTwo = new Lader();
        laderOne.setUp(28);
        laderTwo.setUp(66);
        System.out.println("laderOne 的上底:" + laderOne.getUp());
        System.out.println("laderOne 的下底: " + laderOne.getDown());
        System.out.println("laderTwo 的上底:" + laderTwo.getUp());
        System.out.println("laderTwo 的下底: " + laderTwo.getDown());
    }
}