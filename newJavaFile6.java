package datastructure;
import java.util.*;
 

class Student2
{
    int rollno;
    String name, address;
 
 
    public Student2(int rollno, String name,String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
  
    @Override
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
 
class Sortbyroll implements Comparator<Student2>
{

    @Override
    public int compare(Student2 a, Student2 b)
    {
        return a.rollno - b.rollno;
    }
}
 

class Main
{
    public static void main (String[] args)
    {
        ArrayList<Student2> ar = new ArrayList<Student2>();
        ar.add(new Student2(1, "Vasif", "Baku"));
        ar.add(new Student2(3, "Elnur", "NYC"));
        ar.add(new Student2(2, "Ali", "Washington"));
 
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));
    }
}