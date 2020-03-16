package test;

import java.util.Comparator;
import java.util.Map;

public class GradeComparetor implements Comparator<Map.Entry<Integer,Student>> {
    @Override
    public int compare(Map.Entry<Integer, Student> s1, Map.Entry<Integer, Student> s2) {
        if (s1.getValue().getGrade() < s2.getValue().getGrade()) {
            return 1;
        } else if (s1.getValue().getGrade() == s2.getValue().getGrade()) {
            return 0;
        } else {
            return -1;
        }
    }
}