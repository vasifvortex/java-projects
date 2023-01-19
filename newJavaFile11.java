
package datastructure;
import java.io.*; 
import java.util.*; 
import java.util.*;
public class newJavaFile11 {

 
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack: " + stack);
        System.out.println("Duplicates: " + duplicate(stack));
    }
    public static Stack<Integer> duplicate(Stack<Integer> s) {
        Stack<Integer> returner = new Stack<Integer>();
        while(!s.isEmpty()) {
            int n = s.pop();
            if (!returner.contains(n)) {
                returner.push(n);
            }
        }
        return returner;
    }
}