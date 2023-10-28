import java.util.*;

public class Par{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.println("m & n -> " +  (n & m) );
        String d = sc.nextLine();
        
       System.out.print(Par(d));
        
    }

    static String Par(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char c : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == '(' && c == ')') {
                count++;
            }

            st.push(c);
        }
        
        String S = "";
        for(int i = 0; i < count ; i++) {
            S += "()";
        }

        return S;
    }
}