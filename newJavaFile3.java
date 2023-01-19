package datastructure;
import java.util.ArrayList;
public class newJavaFile3 {
    public static void main(String args[]) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(0);
        arrList.add(5);
	arrList.add(7);
	arrList.add(12);
        arrList.add(7);
        System.out.println(arrList);
        System.out.println(search(arrList));
    }
    public static boolean search(ArrayList<Integer> val){
  
    for (int i = 0; i < val.size(); i++) { 
    for (int j = i + 1 ; j < val.size(); j++){ 
    if(val.get(i)==val.get(j)) 
        
         return true;
        }
    
    }   return false;
}}
       



