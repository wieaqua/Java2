import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.SubmissionPublisher;

import static javax.swing.JFrame.*;

public class WindowMenu extends JFrame { // JFrame 的子类
    JMenuBar menubar;
    JMenu menu, subMenu;
    JMenuItem item1, item2;

    public WindowMenu() {
    }

    public WindowMenu(String s, int x, int y, int w, int h) {
        init(s);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);
        menubar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("软件项目");
        item1 = new JMenuItem("Java 话题", new ImageIcon("a.jpg"));
        item2 = new JMenuItem("动画话题", new ImageIcon("b.jpg"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("汽车销售系统", new ImageIcon("c.jpg")));
        subMenu.add(new JMenuItem("农场信息系统", new ImageIcon("d.jpg")));
        menubar.add(menu);
        setJMenuBar(menubar);
    }
}
