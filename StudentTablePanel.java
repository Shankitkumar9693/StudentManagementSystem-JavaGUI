import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentTablePanel extends JPanel {

    DefaultTableModel model;

    // --- NEW: Public variables so Dashboard can access them ---
    public JTextField searchField = new JTextField(20);
    public JButton searchBtn = new JButton("Search");
    public JButton refreshBtn = new JButton("Refresh");

    public StudentTablePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Search Student"));

        JPanel search = new JPanel();
        
        // Add the variables we created above
        search.add(searchField);
        search.add(searchBtn);
        search.add(refreshBtn);

        String[] cols = {"ID","Name","Gender","Email","Phone"};
        model = new DefaultTableModel(cols,0);

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        add(search, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
    }

    public void loadTable(java.util.List<Student> list) {
        model.setRowCount(0);
        if (list == null || list.isEmpty()) return;
        for (Student s : list) {
            model.addRow(new Object[]{
                    s.id, s.name, s.gender, s.email, s.phone
            });
        }
    }
}