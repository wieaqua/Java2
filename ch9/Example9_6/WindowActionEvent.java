import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener; // listener 是监视器

    public WindowActionEvent() {
        setLayout(new FlowLayout());
        text = new JTextField(10);
        add(text);
        listener = new ReaderListen(); // 创建监视器
        text.addActionListener(listener); // text 讲 listener 注册为自己的监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}