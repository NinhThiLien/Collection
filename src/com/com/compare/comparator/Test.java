package com.com.compare.comparator;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(106,"Ajay",17));
        al.add(new Student(105,"Aj",26));
        al.add(new Student(106,"Ajay",2));
        al.add(new Student(105,"Jai",21));


        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("\n Sorting by Name...");

        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("\n sorting by age...");

        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
