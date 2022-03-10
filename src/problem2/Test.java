package problem2;

import java.awt.dnd.DragGestureEvent;
import java.util.*;

import static problem2.Group.*;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> studenTreeSet = new TreeSet<Student>(Arrays.asList(
                new Student("Dima", "dima@gmail.com",23, JAVA),
                new Student("Roma", "roma@gmail.com", 19, JS),
                new Student("Joma", "joma@gmail.com", 35, JS),
                new Student("Aza", "aza@gmail.com", 29, JS),
                new Student("Mira", "mira@gmail.com", 29, JAVA),
                new Student("Lira", "mira@gmail.com", 60, JAVA),
                new Student("Ira", "ira@gmail.com", 15, JAVA),
                new Student("Murat", "murat@gmail.com", 15, JS)
        ));

        printElments(studenTreeSet);

        System.out.println("****************************************************");

        TreeSet<Student> javaStudents = new TreeSet<>();
        System.out.println(getJavaStudents(studenTreeSet, javaStudents));

        System.out.println("****************************************************");

        TreeSet<Student> jsStudents = new TreeSet<>();
        System.out.println(getJsStudents(studenTreeSet, jsStudents));

    }
    public static TreeSet<Student> getJsStudents(TreeSet<Student> studentTreeSet, TreeSet<Student> jsStudents) {
        for(Student i: studentTreeSet) {
            if(i.getGroup().equals(JS))
                jsStudents.add(i);
        }
        return jsStudents;
    }

    public static TreeSet<Student> getJavaStudents(TreeSet<Student> studentTreeSet, TreeSet<Student> javaStudents) {
        for(Student i: studentTreeSet) {
            if(i.getGroup().equals(JAVA))
                javaStudents.add(i);
        }
        return javaStudents;
    }

    public static TreeSet<Student> printElments(TreeSet<Student> student) {
        for(Student i: student) {
            System.out.println(i);
        }
        return student;
    }

}
/*
Student degen class tuzunuz jana Student classtyn ichine students name, email, group(enum), age
Andan kiyin constructor jana getter/setterlerdi tuzunuz. Student classtyn ichine equals & hashcode tuzunuz,
Main metoddon 8 Student classtyn objectisin tuzunuz, Alardy Set ke salynyz,
Alardy jashyna karat sorttonuz
* */