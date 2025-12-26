import java.util.ArrayList;

public class StudentManager {

    public ArrayList<Student> list = new ArrayList<>();

    public void add(Student s) {
        list.add(s);
    }

    public ArrayList<Student> getAll() {
        return list;
    }

    public void delete(int id) {
        list.removeIf(s -> s.id == id);
    }


    public ArrayList<Student> search(String query) {
        ArrayList<Student> result = new ArrayList<>();
        String q = query.toLowerCase();

        for (Student s : list) {
            if (s.name.toLowerCase().contains(q) ||
                String.valueOf(s.id).contains(q)) {
                result.add(s);
            }
        }
        return result;
    }
}