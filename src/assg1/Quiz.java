/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Quiz {
    static int count=0;
    //////////////////////////////////////only teacher can creare a quiz
    public static void create_quiz(){
        Scanner s1=new Scanner(System.in);
        String Q;
        System.out.print("Enter question statement:\n");
        Q=s1.nextLine();
        try{

        File file=new File("E:/quiz_q.txt");
          FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp = null;
while ((temp = bufferedReader.readLine()) != null)
{}
    PrintWriter fileWriter = new PrintWriter(new    
       FileOutputStream("E:/quiz_q.txt",true));  
    fileWriter.println(Q);
    fileWriter.close();
                    fileReader.close();

       
        }
        
    catch(Exception e) {    

  } ///option for the quiz question
    System.out.println("Enter four options for the question:");
    String A;
    for(int loop=1;loop<5;loop++)
    {
        System.out.print(loop+")");
        A=s1.nextLine();
        
            try{

        File file=new File("E:/quiz_q.txt");
          FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp = null;
while ((temp = bufferedReader.readLine()) != null)
{}
    PrintWriter fileWriter = new PrintWriter(new    
       FileOutputStream("E:/quiz_q.txt",true));  
    fileWriter.println(A);
    fileWriter.close();
                    fileReader.close();

       
        }
        
    catch(Exception e) {    

  } 
            
        
        
    }
        System.out.println("Enter the correct option:");
        String C;
        C=s1.nextLine();
         try{

        File file=new File("E:/quiz_a.txt");
          FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp = null;
while ((temp = bufferedReader.readLine()) != null)
{}
    PrintWriter fileWriter = new PrintWriter(new    
       FileOutputStream("E:/quiz_a.txt",true));  
    fileWriter.println(C);
    fileWriter.close();
                    fileReader.close();

       
        }
        
    catch(Exception e) {    

  } 
        
    }
    public static void display_quiz(){
        try{
         File file=new File("E:/quiz_q.txt");
          FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp;
        
        
       
        
        
    for(int i=0;i<5;i++)
    {
       
        while ((temp = bufferedReader.readLine()) != null)
{
if(i<5){    
        System.out.println(temp);
        
}
}
        option_select();
       // break;
    }
    
}
        
        
        
        
        catch(Exception e) {    

  }  
        
    }
    ////////////////////////////////////////selecting a option and incrementing the static variable "count"
    public static boolean option_select()
    {
        Scanner s2=new Scanner(System.in);
        String option;
        System.out.println("Enter the correct option:");
        option=s2.nextLine();
        
        try{
             File file2=new File("E:/quiz_a.txt");
          FileReader fileReader2 = new FileReader(file2);
      BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String temp2;
        
        while ((temp2 = bufferedReader2.readLine()) != null)
{
    if(option.equals(temp2))
    {
        System.out.println("correct answer");
        count=count+1;
        System.out.println(count+" correct out of 10");
        return true;
}

}
           
        System.out.println("incorrect option");
    //return false;
    
        
        
        }  
        
        
        catch(Exception e){
            
        }
        return false;
    }
        
        
        
        
        
    
//    public static void main(String[] args){
//        display_quiz();
//        option_select();
//    }
}
//    public static void main(String[] args){
//        create_quiz();
//    }

