import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {


        Stack<Integer> s= new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(9);
        Stack<Integer> ans= sort(s);
        while(!ans.isEmpty()){
            System.out.println(ans.pop());
        }
    }
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();

      while(!s.isEmpty()){

          int num= s.pop();
          insert(stack, num);
      }
      return stack;
    }
    public static  void insert(Stack<Integer> stack, int num){
        if(stack.isEmpty()){
            stack.push(num);
        }
        else{
            if(stack.peek()>num){
                int temp=stack.pop();
                insert(stack, num);
                stack.push(temp);
            }else{
                stack.push(num);
            }

        }
    }

}
