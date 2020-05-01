package com.company;

public class Bed {
    private int size;
    private String style;
    private int pillows;
    private int height;
    private int sheets;

    public Bed(int size, String style, int pillows, int height, int sheets) {
        this.size = size;
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public int getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
}
