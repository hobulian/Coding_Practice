package SortingStudentsV2;

import SortingStudentsV2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentClassifier {
    private ArrayList<Student> students;

    public StudentClassifier() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents(String sex) {
        ArrayList<Student> Students = new ArrayList<>();
        if (sex == null) {
            System.out.println("식별자 없음");
        } else if (sex.equals("boy") | sex.equals("girl")) {
            for (Student student : students) {
                if (student.getSex().equals(sex)) {
                    Students.add(student);
                }
            }
        } else if (sex.equals("all")){
            for (Student student : students) {
                Students.add(student);
            }
        } else {
            System.out.println("알 수 없는 식별자");
        }
        return Students;
    }

    public ArrayList<Student> getSortedByComparator(ArrayList<Student> students, String comparator) {
        ArrayList<Student> SortedByComparator = students;
        if (comparator == null) {
            System.out.println("정렬 식별자 없음");
        } else if (comparator.equals("height")) {
            Collections.sort(SortedByComparator, Comparator.comparing(Student::getHeight));
        } else if (comparator.equals("studentNumber")) {
            Collections.sort(SortedByComparator, Comparator.comparing(Student::getStudentNumber));
        } else {
            System.out.println("알 수 없는 정렬 식별자");
        }
        return SortedByComparator;
    }

    public void printResults(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
