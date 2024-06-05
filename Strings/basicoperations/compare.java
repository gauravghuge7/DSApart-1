package basicoperations;

public class compare {
    

    public static void main(String[] args) {
        
        String s = "gaurav";
        String s1 = "gAurav";
        String s2 = "gaurav";

        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(s2));

        System.out.println(s.contains(s1));

        
    }
}
