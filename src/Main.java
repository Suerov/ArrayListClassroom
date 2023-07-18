import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Excepitonss {
        ArrayList<Student> name = new ArrayList<>();
        try {
            Student s = new Student("Marsel", -9);
            name.add(s);
            name.add(null);
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
        for (Student aa : name) {
            if (aa == null) {
                throw new RuntimeException("Oshibka");
            }
        }
    }
}