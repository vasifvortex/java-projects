package datastructure;
import java.io.*; 
import java.util.*; 
public class newJavaFile9 {
public static void main(String args[]) 
    { 
    
        Stack<Integer> stack = new Stack<Integer>();
         
        for(int i=0;i<10;i++){
        stack.push(i);
        }
        System.out.println(stack);
        Reverse(stack);
        System.out.println(Reverse(stack));
    }

public static Stack<Integer> Reverse(Stack<Integer>val){
        Stack<Integer> stack2 = new Stack<Integer>();  
        for(int i=val.size()-1;i>=0;i--){
        stack2.push(i);
        }    
        return stack2;
     }}