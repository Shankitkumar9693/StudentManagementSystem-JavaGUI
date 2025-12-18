import javax.swing.*;

public class BottomButtonPanel extends JPanel {

    JButton add = new JButton("Add New");
    JButton update = new JButton("Update");
    JButton delete = new JButton("Delete");
    JButton clear = new JButton("Clear");

    public BottomButtonPanel() {
        add(add);
        add(update);
        add(delete);
        add(clear);
    }
}

