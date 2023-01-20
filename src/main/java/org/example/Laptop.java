package org.example;

import java.util.List;

public class Laptop{

    String name;
    String opSystem;
    int ram;
    int ssd;
    String color;

    public Laptop(String name, String opSystem, int ram, int ssd, String color) {
        this.name = name;
        this.opSystem = opSystem;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Ноутбук " + name + "\nОперационная система: " + opSystem + "\nОбъем оперативной памяти: " + ram +
                " ГБ\nОбъем накопителя: " + ssd + " ГБ\nЦвет: " + color;
    }

}
