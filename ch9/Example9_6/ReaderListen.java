import java.awt.event.*;

public class ReaderListen implements ActionListener { // 负责创建监视器的类
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // 获取封装在事件中的 命令 字符串
        System.out.println(str + ":" + str.length());
    }
}