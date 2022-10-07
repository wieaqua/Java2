public class Example7_2 {
    public static void main(String[] args) {
        ShowBoard board = new ShowBoard();
        board.showMess(new OutputEnglish()); // 向参数传递 OutputAlphabet 的子类
        // OutputEnglish 的对象

        board.showMess(new OutputAlphabet() // 向参数传递 OutputAlphabet 的匿名子类的对象
        {
            public void output() {
                for (char c = '\u03b1'; c <= '\u03c9'; c++) {
                    System.out.printf("%3c", c);
                }
            }
        });
    }
}