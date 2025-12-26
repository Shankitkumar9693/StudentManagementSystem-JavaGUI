import java.awt.*;
import javax.swing.*;

public class StudentDashboard {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Management System");
        frame.setSize(1200, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        StudentManager manager = new StudentManager();
        StudentFormPanel form = new StudentFormPanel();
        StudentTablePanel table = new StudentTablePanel();
        BottomButtonPanel buttons = new BottomButtonPanel();

        // TOP TITLE

        

        JLabel title = new JLabel("STUDENT MANAGEMENT SYSTEM", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setOpaque(true);
        title.setBackground(new Color(120,230,200));
        frame.add(title, BorderLayout.NORTH);

        // CENTER

        JPanel center = new JPanel(new GridLayout(1,2,10,10));
        center.add(form);
        center.add(table);
        frame.add(center, BorderLayout.CENTER);

        // BUTTON ACTION

        buttons.addBtn.addActionListener(e -> {
            manager.add(form.getStudent());
            table.loadTable(manager.getAll());
            form.clear();
        });
        
        table.searchBtn.addActionListener(e -> {
            String query = table.searchField.getText().trim();
            if (query.isEmpty()) {
                table.loadTable(manager.getAll());
            } else {
                java.util.List<Student> results = manager.search(query);
                table.loadTable(results);
            }
        });

// REFRESH BUTTON ACTION
table.refreshBtn.addActionListener(e -> {
    // Reload the full list
    table.loadTable(manager.getAll());
    table.searchField.setText(""); // Clear the search box
});

        // BOTTOM
        
        frame.add(buttons, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

