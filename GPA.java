import java.util.*;
import java.io.*;

public class GPA {
    public static void main(String[] args) {
        ArrayList<Term> transcript = new ArrayList<Term>();
        double totalCreditHours = 0;
        double totalQualityPoints = 0;
        try {
            FileReader fr = new FileReader("grades.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while(line != null) {
                Term term = new Term(line.substring(1,line.length()-2));
                transcript.add(term);
                int numClasses = Integer.parseInt(line.substring(line.length()-1));
                for(int i = 0; i < numClasses; i++) {
                    line = br.readLine();

                    String[] tokens = line.split(",");
                    Class c = new Class(tokens[0], Double.parseDouble(tokens[1].trim()), tokens[2].trim());

                    totalCreditHours += Double.parseDouble(tokens[1]);
                    c.calculatePoints();
                    totalQualityPoints += c.getPoints();

                    term.addClass(c); 

                }
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (Term t: transcript) {
            System.out.println(t);
        }
        System.out.printf("GPA: %.2f\t\t\t\tCredit Hours: %.2f\tQuality Points: %.2f\n",totalQualityPoints/totalCreditHours, totalCreditHours, totalQualityPoints);
        System.out.println("EOP");
    }
}



