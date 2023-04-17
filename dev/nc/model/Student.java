package dev.nc.model;

import dev.nc.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem {
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstNames = {"Triinu", "Anna", "Deniss", "Keiti", "Toomas"};
    private static String[] courses = {"C", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
    }
    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }
    public int getYearStarted() {
        return yearStarted;
    }
    public void printStudentName(Student s) {
        System.out.println(s.name);
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }
}
