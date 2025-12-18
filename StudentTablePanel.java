import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentTablePanel extends JPanel {

    DefaultTableModel model;

    public StudentTablePanel() {

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Search Student"));

        JPanel search = new JPanel();
        search.add(new JTextField(20));
        search.add(new JButton("Search"));
        search.add(new JButton("Refresh"));

        String[] cols = {"ID","Name","Gender","Email","Phone"};
        model = new DefaultTableModel(cols,0);

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        add(search, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
    }

    public void loadTable(ArrayList<Student> list) {
        model.setRowCount(0);
        for(Student s : list) {
            model.addRow(new Object[]{
                    s.id, s.name, s.gender, s.email, s.phone
            });
        }
    }
}

