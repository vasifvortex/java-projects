
package datastructure;

import java.util.ArrayList;


class GFG {

    int n = 4;
 
    class Data {
 
        int roll;
        String name;
        int marks;
        long phone;
 
     
        Data(int roll, String name, int marks, long phone)
        {
 
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }
 

    public static void main(String args[])
    {
 
        int roll[] = { 1, 2, 3, 4 };
        String name[]
            = { "Shubham", "Atul", "Ayush", "Rupesh" };
        int marks[] = { 100, 99, 93, 94 };
        //change(marks);
        long phone[] = { 8762357381L, 8762357382L,
                         8762357383L, 8762357384L };
 
       
        GFG custom = new GFG();
        System.out.println(" Name is "+getMaxName(marks,name)+" Max mark is "+getMaxValue(marks));
        custom.addValues(roll, name, marks, phone);
    }
   
    public static String getMaxName(int[] marks, String name[]){
        int maxValue = marks[0];
        String studentName=name[0];
        for(int i=1;i < marks.length;i++){
          if(marks[i] > maxValue){
            maxValue = marks[i];
            studentName=name[i];
          }
        }
        return studentName;
     }
    public static int getMaxValue(int[] marks){
        int maxValue = marks[0];
        for(int i=1;i < marks.length;i++){
          if(marks[i] > maxValue){
            maxValue = marks[i];
          }
        }
        return maxValue;
     }
    
    //public static void change(int marks[]){
   // for (int i = 0; i < marks.length; i++) {
   // marks[i]=80;
  //  }
  //  }
    public void addValues(int roll[], String name[],
                          int marks[], long phone[])
    {
        
        ArrayList<Data> list = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            
            list.add(new Data(roll[i], name[i], marks[i],
                              phone[i]));
        }

        printValues(list);
    }
 
    
    public void printValues(ArrayList<Data> list)
    {

        for (int i = 0; i < n; i++) {

            Data data = list.get(i);
            System.out.println(data.roll + " " + data.name
                               + " " + data.marks + " "
                               + data.phone);
        }
    }
}