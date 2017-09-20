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
public class Teacher extends Quiz {
     public static void teacher_signin(){
        Scanner s2=new Scanner(System.in);
        String name;
        String pass;
        System.out.println("Enter username:\n");
        name=s2.nextLine();
        System.out.println("Enter password:\n");
        pass=s2.nextLine();
        
        
          try{

        File file=new File("E:/signin_name.txt");
          FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp = null;
while ((temp = bufferedReader.readLine()) != null)
{
    
if(name.equals(temp))
{
    System.out.println("correct user name");
    break;
}

}
if(!name.equals(temp))
{
       System.out.println("incorrect name"); 
}




          
 //fileReader.close();
          }
          catch(Exception e) {    

  }  
          try{
File file1=new File("E:/signin_pass.txt");
          FileReader fileReader1 = new FileReader(file1);
      BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        String temp1 = null;
while ((temp1 = bufferedReader1.readLine()) != null)
{
if(pass.equals(temp1))
{
    System.out.println("correct password");
    create_quiz();
    break;
    
}

//fileReader1.close();
       
}
    if(!pass.equals(temp1))
{
       System.out.println("incorrect password"); 
}
//    if (name.equals(temp) && pass.equals(temp2) ){
//        
//    }
          }
catch(Exception e) {    

  }  
     

     }
//System.out.print("correct username,password");
}
//    PrintWriter fileWriter = new PrintWriter(new    
//       FileOutputStream("E:/filedata.txt",true));  
    
                   

        
          
        
    
    

