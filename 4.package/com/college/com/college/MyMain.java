package com.college;

import com.college.students.MyStudent;
import com.college.students.studentdetails.MyStudentDetails;
import com.college.teachers.MyTeacher;
import com.college.teachers.teacherdetails.MyTeacherDetails;

public class MyMain {
    public static void main(String[] args) {
        
        // System.out.println("Hello Main!!!");

        MyStudent st = new MyStudent();
        st.print();

        MyStudentDetails sd = new MyStudentDetails();
        sd.print();

        MyTeacher mt = new MyTeacher();
        mt.print();

        MyTeacherDetails td = new MyTeacherDetails();
        td.print();
    }
}