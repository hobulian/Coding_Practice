package SortingStudentsV2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentClassifier classifier = new StudentClassifier();

        classifier.addStudent(new Student("boy", 180, 1001));
        classifier.addStudent(new Student("girl", 165, 2001));
        classifier.addStudent(new Student("boy", 175, 1002));
        classifier.addStudent(new Student("girl", 170, 2003));
        classifier.addStudent(new Student("boy", 185, 1003));
        classifier.addStudent(new Student("girl", 175, 2002));

        classifier.printResults(classifier.getSortedByComparator(classifier.getStudents("all"), "height"));
        classifier.printResults(classifier.getSortedByComparator(classifier.getStudents("girl"), "studentNumber"));

    }
}
