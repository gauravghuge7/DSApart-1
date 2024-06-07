package staticKeyword;

public class staticDemo {
    





    public static void main(String[] args) {

        // System.out.println(student.totalCount);

        System.out.println(student.getCount());
        // student.totalCount = 100;  // this is invalid statement
        
        student s = new student("gaurav", 20, 95.8);
        
        // System.out.println(student.totalCount);
        System.out.println(student.getCount());

        student s1 = new student();

        

        s1.name = "gaurav";
        s1.age = 20;
        s1.percent = 95.8;

        // System.out.println(student.totalCount);  // this is invalid because access is private
        System.out.println(student.getCount());





    }
}
