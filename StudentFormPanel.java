import java.awt.*;
import javax.swing.*;

public class StudentFormPanel extends JPanel {

    JTextField tId = new JTextField();
    JTextField tName = new JTextField();
    JComboBox<String> gender =
            new JComboBox<>(new String[]{"Male","Female"});
    JTextField tEmail = new JTextField();
    JTextField tPhone = new JTextField();

    public StudentFormPanel() {

        setLayout(new GridLayout(6,2,8,8));
        setBorder(BorderFactory.createTitledBorder("Student Details"));

        add(new JLabel("Student ID"));
        add(tId);

        add(new JLabel("Student Name"));
        add(tName);

        add(new JLabel("Gender"));
        add(gender);

        add(new JLabel("Email"));
        add(tEmail);

        add(new JLabel("Phone"));
        add(tPhone);
    }

    public Student getStudent() {
        return new Student(
                Integer.parseInt(tId.getText()),
                tName.getText(),
                gender.getSelectedItem().toString(),
                tEmail.getText(),
                tPhone.getText()
        );
    }

    public void clear() {
        tId.setText("");
        tName.setText("");
        tEmail.setText("");
        tPhone.setText("");
    }
}

