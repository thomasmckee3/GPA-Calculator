import java.util.ArrayList;

public class Term {
    private String name;
    private ArrayList<Class> classes;


    public Term (String name) {
        this.name = name;
        this.classes = new ArrayList<Class>();
    }

    public void addClass(Class c) {
        classes.add(c);
    }

    public String toString() {
        String out = TextColor.BOLD + "***" + name + "***\n" + TextColor.RESET;
        for (Class c : classes) {
            out += " > " + c.toString() + "\n";
        }
        return out;
    }
}
