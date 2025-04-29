package com.ananya.sportal.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentName() {
        Student student = new Student();
        student.setName("Ananya");
        assertEquals("Ananya", student.getName());
    }

    @Test
    public void testStudentSap() {
        Student student = new Student();
        student.setSap("500123456");
        assertEquals("500123456", student.getSap());
    }

    @Test
    public void testStudentContact() {
        Student student = new Student();
        student.setContact("9876543210");
        assertEquals("9876543210", student.getContact());
    }
}
