package com.company;

public class Ytka implements IPlavauhii, ILetauhii {
    String color;
    int size;

    public Ytka(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void plavat() {
        System.out.println("Утка плавает");
    }

    @Override
    public void letat() {
        System.out.println("Утка летает");
    }
}
