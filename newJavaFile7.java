package datastructure;

import java.util.*;

public class newJavaFile7 {

    public static void main(String args[]) {
      List<Integer> l1 = new ArrayList<Integer>();     
       // l1.add(0, 1); 
        //l1.add(1, 2); 
        l1.add(1); 
        l1.add(2); 
        l1.add(3);
        l1.add(6);
        l1.add(7);
        l1.add(1);
       // System.out.println(l1);     
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1); 
        l2.add(1); 
        l2.add(3);  
        l2.add(7); 
        l2.add(10); 
        //l1.addAll(1, l2);
       // System.out.println(l1); 
       // l1.remove(1); 
       // System.out.println(l1); 
       // System.out.println(l1.get(3)); 
        //l1.set(0, 5); 
        System.out.println(l1); 
        System.out.println(l2);
        findSame(l1, l2);
        findUnion(l1, l2);}
        public static void findSame(List<Integer> data1, List<Integer> data2) {
        ArrayList <Integer> mutualNumbers = new ArrayList<Integer>();
            for (int i = 0; i < data1.size(); i++) {
            for (int j = 0; j < data2.size(); j++) {
                if (data1.get(i) == data2.get(j)) {
                    if (!mutualNumbers.contains(data1.get(i))) {
                        mutualNumbers.add(data1.get(i));
                         break;
                    }
                }
            }
        }
        System.out.println(mutualNumbers);
        }
    
       public static void findUnion(List<Integer> data1, List<Integer> data2) {
        ArrayList <Integer> mutualNumbers = new ArrayList<Integer>();
        for (int i = 0; i < data1.size(); i++) {
            if (!mutualNumbers.contains(data1.get(i))) {
                mutualNumbers.add(data1.get(i));
            }
        }
        for (int j = 0; j < data2.size(); j++) {
            if (!mutualNumbers.contains(data2.get(j))) {
                mutualNumbers.add(data2.get(j));
            }
        }
        System.out.println(mutualNumbers);
    }
}


    
    

  

