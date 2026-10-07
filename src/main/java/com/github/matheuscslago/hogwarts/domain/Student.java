package com.github.matheuscslago.hogwarts.domain;

import com.github.matheuscslago.hogwarts.enums.Houses;

public class Student extends Wizard {
    private final int academicYear;

    public Student(int id, String name, Houses magicHouse, int powerLevel, String wand, int academicYear) {
        super(id, name, magicHouse, powerLevel, wand);
        this.academicYear = Math.clamp(powerLevel, 1, 7);
    }

    @Override
    public void especialAction() {
        System.out.println(getName() + " is practicing spells for the N.O.M.s exams!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Academic Year = " + academicYear;
    }

    public int getAcademicYear() {
        return academicYear;
    }
}
