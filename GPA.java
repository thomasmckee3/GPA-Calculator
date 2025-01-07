import java.io.*;

public class GPA {
    public static void main(String[] args) {
        //ArrayList<Term> transcript = new ArrayList<Term>();
        double totalCreditHours = 0;
        double totalQualityPoints = 0;
        try {
            FileReader fr = new FileReader("grades.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while(line != null) {
                Term term = new Term(line.substring(1,line.length()-2));
                //transcript.add(term);
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
                System.out.print(term.toString());
                System.out.printf(TextColor.BOLD + TextColor.BRIGHT_BLUE + "GPA: %.2f\t\t" + TextColor.LIGHT_BLUE_RGB + "Credit Hours: %.2f\t" + "Quality Points: %.2f\n\n" + TextColor.RESET,
                totalQualityPoints / totalCreditHours, totalCreditHours, totalQualityPoints);
              
                line = br.readLine();
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("EOP");
    }
}



