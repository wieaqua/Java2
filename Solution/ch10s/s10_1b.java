import java.io.*;

public class s10_1b {
    public static void main(String[] args) {
        File f = new File("1.txt");
        try {
            RandomAccessFile random = new RandomAccessFile(f, "rw");
            random.seek(0);
            long len = random.length();

            while (len >= 0) {
                len -= 1;
                random.seek(len);
                int c = random.readByte();
                System.out.print((char) c);
            } // while
        } catch (Exception e) {
        }
    }
}