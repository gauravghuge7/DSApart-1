package staticKeyword;

public class student {
    
    String name;
    int age;
    double percent;

    private static int totalCount;


    // default constructor
    student() {

        totalCount++;
      
    }



    // parameterized constructor
    student(String name, int age, double percent) {
        this.age = age;
        this.name = name;
        this.percent = percent;

        totalCount++;
       

    }

    // getter method here

    public static int getCount() {
        return totalCount;
    }

    // SETTER METHOD HERE   

    
}
