package datastructure;
import java.util.ArrayList;
public class newJavaFile2 {

   
    public static void main(String args[]) {
        
       
        ArrayList<String> al = new ArrayList<>();
        al.add("Vasif");
        al.add("Elnur");
        al.add(1, "Oruczade");
        System.out.println("Initial ArrayList " + al);
        al.set(1, "Ahmad");
        System.out.println("Updated ArrayList " + al);
       // al.remove(1);
       // System.out.println("After the Index Removal " + al);
       // al.remove("Vasif");
       // System.out.println("After the Object Removal "+ al);
       remove(al);
       System.out.println("After the Object Removal "+ al);
    }
    public static void remove(ArrayList<String> val) 
    {   val.remove(val.size()-1);
    }}

    


