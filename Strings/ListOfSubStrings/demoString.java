package ListOfSubStrings;

import java.util.ArrayList;
import java.util.List;

public class demoString {
   
   static void listOfString(String s, List<String> ls) {

      String temp = new String(s);

      // iterating over the string 

      for(int i=0; i<temp.length(); i++) {

         ls.add(temp.substring(i));

         System.out.println(temp.substring(i));

         
      } 

   }




   public static void main(String[] args) {
      
      List<String> ls = new ArrayList<>();

      String s = "gaurav";

      listOfString(s, ls);


      System.out.println(ls);


      


   }
}
