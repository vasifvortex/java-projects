
package datastructure;
import java.util.*;

public class newJavaFile14 {

 
    public static void main(String args[]) {
         Queue<String> pq = new PriorityQueue<>();
         Queue<Integer> q = new PriorityQueue<>();
        pq.add("Vasif");
        pq.add("Oruczade");
        pq.add("Elnur");
        pq.add("Azizov");
        pq.add("Elnur");
        pq.add("Oruczade");
        q.add(5);
        q.add(2);
        q.add(3);
        q.add(3);
        q.add(4);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
        System.out.println(pq);
         while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        
    }
}
      
    

