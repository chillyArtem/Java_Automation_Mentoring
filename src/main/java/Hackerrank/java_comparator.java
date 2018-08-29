package Hackerrank;

import java.util.*;
//FIXME
/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/29/2018.
 */
public class java_comparator {
    //Complete the code

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(compareUsingComparator.ORDER_BY_CGPA);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

    static class compareUsingComparator {

        static final Comparator<Student> ORDER_BY_CGPA = (student, student1) -> {
//            int compareCgpa = Double.compare(student.getCgpa(), student1.getCgpa());
//            if (compareCgpa != 0) return compareCgpa;
//
//            int compareFname = student.getFname().compareTo(student1.getFname());
//            if (compareFname != 0) return compareFname;
//
//            return (student.getId() < student1.getId() ? -1 : (student.getId() == student1.getId()) ? 0 : 1);
            return (student.getCgpa() > student1.getCgpa()
                    ? 1
                    : (student.getCgpa() < student1.getCgpa())
                    ? -1
                    : student.getFname().compareTo(student1.getFname()) > 0
                    ? 1
                    : student.getFname().compareTo(student1.getFname()) < 0
                    ? -1
                    : (student.getId() < student1.getId())
                    ? -1
                    : (student.getId() == student1.getId())
                    ? 0
                    : 1);

        };
    }

    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }
}

