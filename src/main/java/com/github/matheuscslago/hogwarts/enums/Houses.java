package com.github.matheuscslago.hogwarts.enums;

public enum Houses {
    GRYFFINDOR("Godric Gryffindor", "bravery"),
    HUFFLEPUFF("Helga Hufflepuff", "dedication"),
    RAVENCLAW("Rowena Ravenclaw", "wisdom"),
    SLYTHERIN("Salazar Slytherin", "astuteness");

    private final String founder;
    private final String virtue;

    Houses(String founder, String virtue) {
        this.founder = founder;
        this.virtue = virtue;
    }

    public String getFounder() {
        return founder;
    }

    public String getVirtue() {
        return virtue;
    }
}
