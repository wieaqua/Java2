import java.io.*;

public class s10_2 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null; // 先全部至空
        try {
            fr = new FileReader("input.txt"); // 读入文件
            br = new BufferedReader(fr);
            fw = new FileWriter("output.txt"); // 写出文件
            bw = new BufferedWriter(fw);
            String line = null; // 存放每行的字符串
            int lineNum = 1; // 行号从1开始
            while ((line = br.readLine()) != null) { // 逐行读入
                bw.write(lineNum + ": " + line); // 添加行号
                bw.newLine(); // 换行
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}