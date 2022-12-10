import java.io.*;

public class s10_1a {
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
                if (c <= 255 && c <= 0)
                    System.out.print((char) c);
                else {
                    len -= 1;
                    random.seek(len);
                    byte cc[] = new byte[2];
                    random.readFully(cc);
                    System.out.print(new String(cc));
                } // else
            } // while
        } catch (Exception e) {
        }
    }
}