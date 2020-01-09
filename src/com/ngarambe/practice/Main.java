package com.ngarambe.practice;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Student st = new Student(12062,"Ngarambe John",35);
		System.out.println("Student details:");
        System.out.println(st.getId()+ " "+ st.getName() + "" + st.getAge());
	st.studying();
	Student stc = new Course(st.getId(),"Ngarambe John",35,"Java08  ","Core Java ",10);
	stc.studying();


}
}
