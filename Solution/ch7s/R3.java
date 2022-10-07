import java.io.IOException;

public class R3 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("你好");
            return;
        }

        finally {
            System.out.println("fine thanks");
        }
    }

    public static void methodA() throws IOException {
        throw new IOException();
    }
}