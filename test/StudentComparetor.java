package test;

import java.util.Comparator;

    public class StudentComparetor implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
         if (s1.getGrade() < s2.getGrade()) {
                return 1;
            } else if (s1.getAge() == s2.getAge()) {
                return 0;
            } else {
                return -1;
            }


        }
    }


