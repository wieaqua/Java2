import java.awt.event.*;
import javax.swing.*;

public class OperatorListener implements ItemListener {
    JComboBox<String> choice;
    ComputerListener workTogether;

    public void setJComboBox(JComboBox<String> box) {
        choice = box;
    }

    public void setWorkTogether(ComputerListener computer) {
        workTogether = computer;
    }

    public void itemStateChanged(ItemEvent e) {
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao);
    }
}