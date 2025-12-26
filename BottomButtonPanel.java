import javax.swing.*;

public class BottomButtonPanel extends JPanel {

    public JButton addBtn = new JButton("Add New");
    public JButton update = new JButton("Update");
    public JButton delete = new JButton("Delete");
    public JButton clear = new JButton("Clear");

    public BottomButtonPanel() {
        add(addBtn);
        add(update);
        add(delete);
        add(clear);
    }
}

