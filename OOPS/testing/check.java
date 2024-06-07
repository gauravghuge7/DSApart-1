package testing;

import oopsPackage.student;

public class check {
    public static void main(String[] args) {
        student s2 = new student();
        
        s2.name = "John";
        s2.age = 20;        
        System.out.println(s2.name);
        System.out.println(s2.age);

    }
}
