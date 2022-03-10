package problem2;

import java.util.Comparator;
import java.util.Objects;

public class Student  implements Comparable<Student>{

    private String name, email;
    private int age;
    private Group group;

    public Student(String name, String email, int age, Group group) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email) && group == student.group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return age > o.age ? 1 : -1;
    }
}
