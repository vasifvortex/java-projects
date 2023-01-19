package datastructure;
import java.io.*; 
import java.util.*; 
import java.util.*;
public class newJavaFile10 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(1);

        Stack<Integer> stackcopy1=(Stack<Integer>) stack.clone();
        System.out.println("Initial Stack: " + stack);   
        //System.out.println("Reverse Stack: " + reverse(stackcopy1));
       // System.out.println("Final: " + search(stack,reverse(stackcopy1)));
        System.out.println("Final: " + isSame(stack,reverse(stackcopy1)));
    }
    
    public static Stack<Integer> reverse(Stack<Integer> stack1) {
        int size = stack1.size();
        Stack<Integer> reverseStack = new Stack<Integer>();
        for (int index = 0; index < size; index++) {
            reverseStack.push(stack1.pop());
        }
        return reverseStack;
    }
    public static boolean search(Stack<Integer> val,Stack<Integer> val2){
       
    String a = String.valueOf(val);
    String b= String.valueOf(val2);

    return a.equals(b);
}  public static boolean isSame(Stack<Integer> val,Stack<Integer> val2) {
    
    	for(int c = 0; c < val.size(); c++) {
    		if(val.peek() != val2.peek()) {
    			return false;
    		}
    		val.pop();
    		val2.pop();
    	}
    	return true;
    }
    
    
    
    
}

    






    