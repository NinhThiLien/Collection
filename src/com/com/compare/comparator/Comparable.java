package com.com.compare.comparator;

import java.util.*;
public class Comparable {
    public static void main(String args[]){
        ArrayList<Student2> al=new ArrayList<Student2>();
        al.add(new Student2(101,"Vijay",23));
        al.add(new Student2(106,"Ajay",27));
        al.add(new Student2(105,"Jai",21));

        Collections.sort(al);
        for(Student2 st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("List");
        for(Student2 st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
