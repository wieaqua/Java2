import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
    PanelGridLayout panelGrid; // 网格布局的面板
    PanelNullLayout panelNull; // 空布局的面板
    JTabbedPane p; // 选项卡窗格

    ShowLayout() {
        panelGrid = new PanelGridLayout();
        panelNull = new PanelNullLayout();
        p = new JTabbedPane();
        p.add("网格布局的面板", panelGrid);
        p.add("空布局的面板", panelNull);
        add(p, BorderLayout.CENTER);
        add(new JButton("窗体是 BorderLayout 布局"), BorderLayout.NORTH);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("西"), BorderLayout.WEST);
        add(new JButton("东"), BorderLayout.EAST);
        setBounds(10, 10, 570, 390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
}