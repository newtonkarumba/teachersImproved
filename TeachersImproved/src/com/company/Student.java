package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Student {
    private String  grade;
    private String  name;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Please input grade for John: ");
        System.out.println("John had grade: "+ s.nextLine());

        System.out.println("Please input grade for James: ");
        System.out.println("James had grade: "+ s1.nextLine());

        System.out.println("Please input grade for Mary: ");
        System.out.println("Mary had grade: "+ s2.nextLine());

        System.out.println("Please input grade for Lucy: ");
        System.out.println("Lucy had grade: "+ s3.nextLine());

        Collection  c = new ArrayList();
        c.add(s.nextLine());
        c.add(s1.nextLine());
        c.add(s2.nextLine());
        c.add(s3.nextLine());

        Iterator<String> itr = c.iterator();
        grade=itr.next();
        while(itr.hasNext()){

            System.out.println(grade);
        }
        this.grade = grade;
    }

    public String  getName() {
        return this.name;

    }

    private Iterator iterator() {
        return iterator();
    }

    public void setName(String name) {
        Student student = new Student();
        Collection collection = new ArrayList();
        collection.add("John");
        collection.add("James");
        collection.add("Mary");
        collection.add("Lucy");

        Iterator itr2 = student.iterator();
        name= String.valueOf(itr2.next());
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        this.name = name;
    }
}
