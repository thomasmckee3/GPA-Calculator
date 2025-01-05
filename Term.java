import java.util.ArrayList;

public class Term {
    private String name;
    private int year;
    private int numClasses;
    private ArrayList<Class> list;
    public Term (String n) {
        name = n;
        list = new ArrayList<Class>();
    }

    public void addClass(Class c) {
        list.add(c);
    }

    public String toString() {
        String out = "***" + name + "***\n";
        for(int i = 0; i < list.size(); i++) {
            out += " > " + list.get(i).toString() + "\n";
        }
        return out;
    }
}
