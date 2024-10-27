import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {


        Stack<Integer> s= new Stack<>();
        s.push(3);
        s.push(2);
        s.push(6);
        s.push(1);
        Stack<Integer> ans= sort(s);
        while(!ans.isEmpty()){
            System.out.println(ans.pop());
        }
    }
    public static Stack<Integer> sort(Stack<Integer> s) {

        Stack<Integer> result= new Stack<>();

        while(!s.isEmpty()){
            int temp=s.pop();

            while(!result.isEmpty() && result.peek()>temp){
                s.push(result.pop());
            }
            result.push(temp);
        }
        return result;
    }

}
