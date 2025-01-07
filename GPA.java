import java.io.*;
import java.util.ArrayList;

public class GPA {
    public static void main(String[] args) {
        ArrayList<Term> transcript = new ArrayList<>();
        double totalCreditHours = 0;
        double totalQualityPoints = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("grades.txt"));
            String line;
            Term currentTerm = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("*")) {
                    // New term
                    currentTerm = new Term(line.substring(1, line.length() - 1));
                    transcript.add(currentTerm);
                } else {
                    // Class entry
                    String[] tokens = line.split(",");
                    Class c = new Class(tokens[0].trim(), Double.parseDouble(tokens[1].trim()), tokens[2].trim());
                    totalCreditHours += c.getCreditHours();
                    c.calculatePoints();
                    totalQualityPoints += c.getPoints();
                    currentTerm.addClass(c);
                }
            }

            br.close();

            // Print transcript and calculate GPA
            for (Term term : transcript) {
                System.out.print(term.toString());
            }

            System.out.printf(TextColor.BOLD + TextColor.BRIGHT_BLUE + "Overall GPA: %.2f\t\t" + 
                              TextColor.LIGHT_BLUE_RGB + "Total Credit Hours: %.2f\t" + 
                              "Total Quality Points: %.2f\n" + TextColor.RESET,
                              totalQualityPoints / totalCreditHours, totalCreditHours, totalQualityPoints);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
