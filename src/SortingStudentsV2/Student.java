package SortingStudentsV2;

public class Student {
    private String sex;
    private int height;
    private int studentNumber;

    public Student(String sex, int height, int studentNumber) {
        this.sex = sex;
        this.height = height;
        this.studentNumber = studentNumber;
    }

    public String getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "Sex: " + sex + ", Height: " + height + ", Student Number: " + studentNumber;
    }
}
