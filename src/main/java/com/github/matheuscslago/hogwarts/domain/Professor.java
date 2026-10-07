package com.github.matheuscslago.hogwarts.domain;

import com.github.matheuscslago.hogwarts.enums.Houses;

public class Professor extends Wizard {
    private final String subject;

    public Professor(int id, String name, Houses magicHouse, int powerLevel, String wand, String subject) {
        super(id, name, magicHouse, powerLevel, wand);
        this.subject = subject;
    }

    @Override
    public void especialAction() {
        System.out.println(getName() + " is teaching a " + this.subject + " class!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Subject = " + subject;
    }

    public String getSubject() {
        return subject;
    }
}
