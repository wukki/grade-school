import java.util.TreeMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class School {

    private Map<Integer, List<String>> grades = new TreeMap<Integer, List<String>>();

    public void add(String name, int grade) {
        List<String> names = new LinkedList<String>();

        if (grades.keySet().contains(grade)) {
            names = grades.get(grade);
            names.add(name);
        } else names.add(name);
        grades.put(grade, names);
    }

    public Map<Integer, List<String>> db() {
        return grades;
    }

    public List<String> grade(int grade) {
        if (!grades.keySet().contains(grade)) grades.put(grade, new LinkedList<String>());
        return grades.get(grade);
    }

    public Map<Integer, List<String>> sort() {
        Map<Integer, List<String>> sorted = new TreeMap<Integer, List<String>>(grades);
        for (Integer key : sorted.keySet()) Collections.sort(sorted.get(key));
        return sorted;
    }
}
