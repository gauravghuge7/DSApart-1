package reverse;

import builder.strBuilder;

public class reverseStri {
    

    public static void main(String[] args) {
        
        String s = "gAurAv";

        StringBuilder str = new StringBuilder(s);
        System.out.println(str);

        for(int i=0; i<str.length(); i++) {

            boolean flag = true;

            char ch = str.charAt(i);

            int aski = (int) ch;
            if(ch == ' ') continue;

            if(aski >= 97) flag = false;
            
            if(flag) {
                aski += 32;
                char dh = (char) ch;

                str.setCharAt(i, dh);
            }
            else {
                aski -= 32;
                char dh = (char) aski;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);

    }
}
