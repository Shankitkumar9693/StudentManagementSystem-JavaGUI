import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> list = new ArrayList<>();

    public void add(Student s) {
        list.add(s);
    }

    public ArrayList<Student> getAll() {
        return list;
    }

    public void delete(int id) {
        list.removeIf(s -> s.id == id);
    }
}

