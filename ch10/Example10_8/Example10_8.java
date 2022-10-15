import java.io.*;

public class Example10_8 {
    public static void main(String[] args) {
        RandomAccessFile inAndOut = null;
        int date[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            inAndOut = new RandomAccessFile("tom.dat", "rw");
            for (int i = 0; i < date.length; i++) {
                inAndOut.writeInt(date[i]);
            }

            for (long i = date.length - 1; i >= 0; i--) {
                // int 型数据占 4 个字节 inAndOut 从文件的第 36 个字节读取最后面的一个整数
                inAndOut.seek(i * 4);
                System.out.printf("\t%d", inAndOut.readInt()); // 隔 4 字节往前读取一个整数
            }

            inAndOut.close();
        } catch (IOException e) {
        }
    }
}