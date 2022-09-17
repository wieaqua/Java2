// 输出全部的希腊字母

public class solution4_2 {
    public static void main(String args[]) {
        char ch;
        char begin, end;
        begin = '\u0391'; // A
        end = '\u03D6'; // 希腊 Pi 符号
        for (ch = begin; ch <= end; ch++) {
            System.out.printf("%c ", ch);
        }
    }
    
}
