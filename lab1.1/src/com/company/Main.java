package com.company;
import com.company.Student;
import com.company.University;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Belinschi Victoria", 19, 9.33);
        Student student2 = new Student("Sanduta Adriana", 20, 9.51);
        Student student3 = new Student("Virtosu Dan", 18, 9.87);
        Student student4 = new Student("Rusu Dacian", 20, 8.89);
        Student student5 = new Student("Strainu Tudor", 21, 8.56);
        Student student6 = new Student("Lupu Nicoleta", 20, 9.25);

        Student[] students_uni1 = {student1, student2};
        Student[] students_uni2 = {student3, student4};
        Student[] students_uni3 = {student5, student6};

        University university1 = new University("Technical University of Moldova", 1970, students_uni1);
        University university2 = new University("Academy of Economic Studies", 1965, students_uni2);
        University university3 = new University("State University of Moldova", 1959, students_uni3);

        System.out.println("Technical University average mark: " +university1.getaveragemark());
        System.out.println("Academy of Econnomic Studies average mark:" +university2.getaveragemark());
        System.out.println("State University of Moldova:" +university3.getaveragemark());

        System.out.println("General average mark: " +(university1.Uniaverage() + university2.Uniaverage() + university3.Uniaverage())/3);
    }
}
