package datastructure;
import java.util.Arrays;
import java.util.*;
import java.io.*;
public class newJavaFile1 {

     public static void main(String args[]) {    
        int [] scores= new int[]{1,2,3,4};
        int [] exams=new int[]{3,4,5,6,7};
        double[] datas=new double[]{1.2,2.3,0};
        System.out.println(Arrays.toString(exams));
        System.out.println(Arrays.toString(scores));
        exams =Arrays.copyOf(scores,4);
        System.out.println(Arrays.toString(exams));
        System.out.println(Arrays.toString(scores));
        exams =Arrays.copyOf(scores,5);
        System.out.println(Arrays.toString(exams));
        System.out.println(Arrays.toString(scores));
        exams =Arrays.copyOfRange(scores,1,3);
        System.out.println(Arrays.toString(exams));
        System.out.println(Arrays.toString(scores));
        System.out.println(search(datas));
        System.out.println(max(datas));
        System.out.println(Arrays.toString(datas));
        
        System.out.println(Arrays.toString(datas));
     }
    public static boolean search(double[] data){
    for (double item:data){
    if(item==0)
        return true;
    
    }
    return false;}

    public static double max(double[] data){
  
        
    double max=data[0];
     for (int i = 1; i < data.length; i++){
            if (data[i] > max)
                max = data[i];
     }
        return max;
    
    }}

    
   
