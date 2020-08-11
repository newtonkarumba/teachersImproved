package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeachersTest {

    @Test
    public void getName() {
        assertEquals("name","John");
    }

    @Test
    public void setName() {
        assertEquals("name","John");
    }

    @Test
    public void getSubject() {
        assertEquals("subject","English");
    }

    @Test
    public void setSubject() {
        assertEquals("subject","English");
    }
}