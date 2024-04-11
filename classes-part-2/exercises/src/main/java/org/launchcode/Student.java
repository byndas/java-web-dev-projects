package org.launchcode;

public class Student {
    private static int nextId = 1;
    private String name;
    private int id;
    private int totalCredits;
    private double gpa;

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
    // constructor
    public Student (String name, int id, int totalCredits, double gpa) {
        this.name = name;
        this.id = id;
        this.totalCredits = totalCredits;
        this.gpa = gpa;
    }
    // constructor
    public Student(String name, int id) {
        this(name, id, 0, 0);
    }
    // constructor
    public Student(String name) {
        this(name, nextId);
        nextId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        // return student grade level based on credits
        if (totalCredits < 30) { return "Freshman"; }
        else if (totalCredits < 60) { return "Sophomore"; }
        else if (totalCredits < 90) { return "Junior"; }
        else { return "Senior"; }
    }

    public void addGrade(int courseCredits, double grade) {
        // update totalCredits & gpa
        double totalQualityScore = gpa * totalCredits;
        totalQualityScore += courseCredits * grade;

        totalCredits += courseCredits;
        gpa = totalQualityScore/totalCredits;
    }

    public String toString() {
        // return well-formatted String, not merely class fields
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", name, getGradeLevel(), getTotalCredits(), getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        // which fields must match for two Student objects to be equal?
        if (toBeCompared == this) { return true; }
        if (toBeCompared == null) { return false; }
        if (toBeCompared.getClass() != getClass()) { return false; }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getId() == getId();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public int getTotalCredits() { return totalCredits; }
    private void setTotalCredits(int newTotalCredits) {
        this.totalCredits = newTotalCredits;
    }
}