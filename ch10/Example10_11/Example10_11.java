import java.io.*;

public class Example10_11 {
    public static void main(String[] args) {
        File file = new File("apple.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeInt(100);
            ;
            outData.writeLong(123456);
            outData.writeFloat(3.1415926f);
            outData.writeDouble(987654321.1234);
            outData.writeBoolean(true);
            outData.writeChars("How are you doing");
        } catch (IOException e) {
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            System.out.println(inData.readInt());
            System.out.println(inData.readLong());
            System.out.println(inData.readFloat());
            System.out.println(inData.readDouble());
            System.out.println(inData.readBoolean());
            char c = '\0';
            while ((c = inData.readChar()) != '\0') {
                System.out.print(c);
            }
        } catch (IOException e) {
        }
    }
}