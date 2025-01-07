public class Class {
    private String name;
    private double hours;
    private double points;
    private String grade;
    private String gradeColour;

    public Class(String name, double hours, String grade) {
        this.name = name;
        this.hours = hours;
        this.grade = grade;
        calculatePoints();
    }

    public void calculatePoints() {
        switch(grade) {
            case "A+":
                points = 4.5 * hours;
                gradeColour = TextColor.DARK_GREEN_RGB;
                break;
            case "A":
                points = 4.0 * hours;
                gradeColour = TextColor.GREEN;
                break;
            case "B+":
                points = 3.5 * hours;
                gradeColour = TextColor.YELLOW;
                break;
            case "B":
                points = 3.0 * hours;
                gradeColour = TextColor.YELLOW;
                break;
            case "C+":
                points = 2.5 * hours;
                gradeColour = TextColor.ORANGE_256;
                break;
            case "C":
                points = 2.0 * hours;
                gradeColour = TextColor.ORANGE_256;
                break;
            case "D+":
                points = 1.5 * hours;
                gradeColour = TextColor.RED;
                break;
            case "D":
                points = 1.0 * hours;
                gradeColour = TextColor.RED;
                break;
            case "F":
                points = 0.0 * hours;
                gradeColour = TextColor.RED;
                break;
        }
    }

    public double getPoints() {
        return points;
    }

    public double getCreditHours() {
        return hours;
    }

    public String toString() {
        
        String out = String.format("Course: %s%s%s\tGrade: %s%s%s%s\tCredit Hours: %.1f\tQuality Points: %.1f",TextColor.BOLD,name,TextColor.RESET,TextColor.BOLD,gradeColour,grade,TextColor.RESET,hours,points);
        return out;
    }
}
