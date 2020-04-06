package ProductManager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Controller {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("phi", 26, "ha noi");
        Student student3 = new Student();
        Map<Integer, Student> listStudents = new HashMap<>();
        listStudents.put(1, student1);
        listStudents.put(2, student2);
        listStudents.put(3, student3);
        for (Map.Entry<Integer, Student> st : listStudents.entrySet()) {
            System.out.println(st.toString());
        }
        System.out.println();
        Set<Student> listStudents2 = new HashSet<>();
        listStudents2.add(student1);
        listStudents2.add(student2);
        listStudents2.add(student1);
        for (Student student : listStudents2) {
            System.out.println(student.toString());
        }
    }
}