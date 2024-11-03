import java.util.Stack;

public class ReverseStackGFG {
    public static void main(String[] args) {

        Stack<Integer> s= new Stack<>();
        s.push(6);
        s.push(9);
        s.push(3);
        s.push(4);
         reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    static  void reverse(Stack<Integer> s) {

        if(!s.isEmpty()){
            int num =s.pop();
            reverse(s);
            insertNumbers(s, num );

        }
    }
    public static void insertNumbers(Stack<Integer> stack, int num) {
        if (stack.isEmpty()) {
            stack.push(num);
        } else {
            int temp = stack.pop();
            insertNumbers(stack, num);
            stack.push(temp);
        }
    }

}
