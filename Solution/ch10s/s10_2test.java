import java.io.*;

public class s10_2test {
    public static void main(String[] args) {
        File f = new File("output.txt");
        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
}
