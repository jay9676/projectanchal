package week1;

import java.util.Stack;

 class reverseeq {
    static String Reverse_EATION(String eq) {
        Stack<String> stk = new Stack<>();

    StringBuilder current = new StringBuilder();
        for(char c: eq.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                //stk.push()
                current.append(c);
            }
            else {
                if (current.length() > 0) {
                    stk.push(current.toString());
                    current.setLength(0);
                }
                stk.push(Character.toString(c));
            }
        }
            if (current.length() > 0) {
                stk.push(current.toString());
            }
            StringBuilder result= new StringBuilder();
            while(current != null){
                result.append(stk.pop());
            }
            return result.toString();

        }


    public static void main(String[] args) {
        String eq="a+b+c/d-e";
        System.out.println(Reverse_EATION(eq));
    }
}
