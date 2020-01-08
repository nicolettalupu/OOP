package com.company;
import com.company.Student;
public class University {
    private String uniname;
    private int foundationyear;
    Student [] Student;

    public University(String uniname, int foundationyear, Student [] Student) {
        this.uniname = uniname;
        this.foundationyear = foundationyear;
        this.Student = Student;
    }
    public double getaveragemark () {
        double result = 0;
        for (int i = 0; i < Student.length; i++) {
            result += Student[i].getMark();
        }
        return result / Student.length;
    }
    public double Uniaverage() {return getaveragemark();}
}
