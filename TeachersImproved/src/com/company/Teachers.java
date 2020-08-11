package com.company;
import java.util.*;

public class Teachers extends Student{
    private String name;
    private String subject;


    public String getName() {

        return name;
    }

    public void setName(String name) {
        Teachers teachers = new Teachers();

        Collection collection = new ArrayList();
        collection.add("Bruno");
        collection.add("Pogba");
        collection.add("Kevin");
        collection.add("Sergio");

        Iterator itr = teachers.iterator();
        name = String.valueOf(itr.next());
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        this.name = name;
    }

    private Iterator iterator() {
        return iterator();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        Teachers teachers = new Teachers();
        Collection collection = new ArrayList();
        collection.add("Bruno teaches English");
        collection.add("Pogba teaches Kiswahili");
        collection.add("Kevin teaches Math");
        collection.add("Sergio teaches French");

        Iterator itr = teachers.iterator();
        subject = String.valueOf(itr.next());
        while (itr.hasNext()) {
            System.out.println(itr.next());

            this.subject = subject;
        }
    }
}