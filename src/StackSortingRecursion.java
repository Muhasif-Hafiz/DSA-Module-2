import java.util.Stack;

public class StackSortingRecursion {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(3);
        s.push(2);
        s.push(9);
        s.push(1);

        Stack<Integer> ans= sort(s);

       while(!ans.isEmpty()){
           System.out.println(ans.pop());
       }
    }
    public static Stack<Integer> sort(Stack<Integer> s){

        Stack<Integer> stack = new Stack<>();
        recursion(stack, s,0,s.size());
        return stack;
    }
    public  static void helper(Stack<Integer> stack, Stack<Integer> s, int index){


        while (!s.isEmpty()){

            int num= s.pop();

            while(!stack.isEmpty() && stack.peek()>num){
                s.push(stack.pop());
            }
            stack.push(num);

        }
    }
    public static void recursion (Stack<Integer> stack, Stack<Integer> s, int ind, int n){

        if(ind==n){
            return ;
        }
        int num= s.pop();
        while(!stack.isEmpty() && stack.peek() > num ){
            s.push(stack.pop());
        }
        stack.push(num);
        recursion(stack, s, ind+1,n);
    }
}
