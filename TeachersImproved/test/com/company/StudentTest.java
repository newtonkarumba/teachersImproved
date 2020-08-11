package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getGrade() {
        assertEquals("grade","C");
    }

    @Test
    public void setGrade() {
        assertEquals("grade","C");
    }

    @Test
    public void getName() {
        assertEquals("name","Lucy");
    }

    @Test
    public void setName() {
        assertEquals("name","Lucy");
    }
}