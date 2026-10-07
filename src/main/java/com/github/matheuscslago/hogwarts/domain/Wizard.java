package com.github.matheuscslago.hogwarts.domain;

import com.github.matheuscslago.hogwarts.enums.Houses;

public abstract class Wizard {
    private final int id;
    private final String name;
    private final Houses magicHouse;
    private int powerLevel;
    private final String wand;

    public Wizard(int id, String name, Houses magicHouse, int powerLevel, String wand) {
        this.id = id;
        this.name = name;
        this.magicHouse = magicHouse;
        this.powerLevel = Math.clamp(powerLevel, 0, 100);
        this.wand = wand;
    }

    public void spendSpell(String magic) {
        System.out.println(this.name + " cast the " + magic + " spell with the power of " + this.powerLevel);
    }

    public abstract void especialAction();

    @Override
    public String toString() {
        return
                " ID = " + id +
                        " | Name = " + name +
                        " | Magic House = " + magicHouse +
                        " | Power Level = " + powerLevel +
                        " | Wand = " + wand
                ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Houses getMagicHouse() {
        return magicHouse;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getWand() {
        return wand;
    }
}
