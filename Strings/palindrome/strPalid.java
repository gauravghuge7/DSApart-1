package palindrome;

public class strPalid {
    
    public static void main(String[] args) {
        String str = "abba";

        int i=0;
        int j=str.length() -1;
        boolean flag = true;

        while(i<j) {

            char start = str.charAt(i);
            char end = str.charAt(j);

            if(start != end) {
                System.out.println("not palindrome");
                flag = false;
                break;
            }
            
            i++;
            j--;

        }

        if(flag)
        System.out.println("Palindrome");
        
        
    }
}
