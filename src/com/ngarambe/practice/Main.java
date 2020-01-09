package com.ngarambe.practice;

public class Main {

    public static void main(String[] args) {
	Student st = new Student(12062,"Ngarambe John",35);
        System.out.println(st.getId()+ " "+ st.getName() + "" + st.getAge());
	st.studying();
    }
}
