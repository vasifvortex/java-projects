package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class newJavaFile13{

String Name;



  public static void main(String[] args) {
  //Scanner scan = new Scanner(System.in);
  //String name=scan.nextLine();
  
    //Students Student1 = new Students("Vasif");
    
  //  Students Student2 = new Students("Elnur");
   // Students Student3 = new Students("Ali");
   // Students Student4 = new Students("Rashad");
    //Students Student5 = new Students("Ilkin");
  
    Queue <Students> q = new LinkedList<Students>();  
   // q.add(Student1);
    
   // q.add(Student2);
  //  q.add(Student3);
   // q.add(Student4);
  //  q.add(Student5);
   // System.out.println("Number of Student: " + findIndex(q,name));
    System.out.println("New: " + limit(q));
    for(Students item : q){
           System.out.println(item.Name);}
  
  }
//public static int findIndex(Queue<Students>q,String name){
//    int i=0;
//       for(Students item : q){
//           if (item.Name.equals(name)) {
//               return i;
//           }
//           else{i++;}}
//    return -1;
//    }
public static Queue limit(Queue<Students>q){
    System.out.println("number of size:");
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    System.out.println("number of students:");
    Scanner scan2 = new Scanner(System.in);
    int y=scan2.nextInt();
  
    
     
       
       for(int i=0;i<y;i++){
       System.out.println("add name:");
       Scanner scan1 = new Scanner(System.in);
       String name=scan1.nextLine();
       Students Students = new Students(name);
       if(q.size()<x){
       q.add(Students);}
       else{
           System.out.println("U can not add more ");
       }
       }
    return q;
    }
}