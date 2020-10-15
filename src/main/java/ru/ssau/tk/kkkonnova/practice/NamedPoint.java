package ru.ssau.tk.kkkonnova.practice;

public class NamedPoint extends Point {
    private String name;

    NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
