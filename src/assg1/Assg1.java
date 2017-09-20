/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg1;
import java.util.Scanner;
/**
 *
 * @author HP Pavilion
 */
public class Assg1 extends Teacher{  //main class extendint the teaher class

    /**
     * @param args the command line arguments
     */
 static   long startTime = System.currentTimeMillis();
   static long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    public static void main(String[] args) {
        System.out.println("MEmory used before running the program "+beforeUsedMem);
            Scanner s1=new Scanner(System.in);
            int a1=0;
    while(a1!=3){
            System.out.print("select an option (input 1,2,3)\n");     //repetitive menu
    System.out.print("1)Teacher\n2)Student\n3)Quit\n");
    a1=s1.nextInt();
    if(a1==1){
       
teacher_signin();  //calling the sighup function from teacher class
//Teacher t1=new Teacher();
//t1.option_select();
        }
        
    
    
    if(a1==2){
        Student st=new Student();
    st.student_signin();  //sign in from student function
    }
   // if (a1==3){}
    
    }
    long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    long actualMemUsed=afterUsedMem-beforeUsedMem;
    System.out.println("memory used after running program "+actualMemUsed);//calculates memory usage after runnig the program
    long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println("total time taken by the program "+totalTime);   //calculate the total time for running the function
}
    
}