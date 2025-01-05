public class Class {
    private String name;
    private double hours;
    private double points;
    private String grade;
    public Class(String n, double h, String g) {
        name = n;
        hours = h;
        grade = g;
        calculatePoints();
    }

    public void calculatePoints() {
        switch(grade) {
            case "A+":
                points = 4.5 * hours;
                break;
            case "A":
                points = 4.0 * hours;
                break;
            case "B+":
                points = 3.5 * hours;
                break;
            case "B":
                points = 3.0 * hours;
                break;
            case "C+":
                points = 2.5 * hours;
                break;
            case "C":
                points = 2.0 * hours;
                break;
            case "D+":
                points = 1.5 * hours;
                break;
            case "D":
                points = 1.0 * hours;
                break;
        }
    }

    public double getPoints() {
        return points;
    }

    public String toString() {
        String out = String.format("Course: %s\tGrade: %s\tCredit Hours: %.1f\tQuality Points: %.1f",name,grade,hours,points);
        return out;
    }
}
