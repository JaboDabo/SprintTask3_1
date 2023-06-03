package kz.bitlab.springboot.techboot.db;

import java.util.ArrayList;

public class DBManager {
//

    private static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 1L;

    static {
        Student s = new Student();
        s.setId(0L);
        s.setName("Zhambyl");
        s.setSurname("Dauletkhan");
        s.setExam(100);
        s.setMark("A");

        students.add(s);
    }




    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {

        if(student.getExam() >= 90) student.setMark("A");
        else if(student.getExam() >= 75) student.setMark("B");
        else if(student.getExam() >= 60) student.setMark("C");
        else if(student.getExam() >= 50) student.setMark("D");
        else student.setMark("F");
        student.setId(id);
        id++;
        students.add(student);
    }


}