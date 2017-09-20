/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Student extends Quiz{
     public static void student_signin(){
        Scanner s2=new Scanner(System.in);
        String name;
        String pass;
        System.out.println("Enter username:\n");
        name=s2.nextLine();
        System.out.println("Enter password:\n");
        pass=s2.nextLine();
        
        
          try{
/////////////////////////////////////////////////////////comparing the username in the file with the entered username
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
File file1=new File("E:/signin_pass.txt");                               //file handling to compare from the correct password file
          FileReader fileReader1 = new FileReader(file1);
      BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        String temp1 = null;
while ((temp1 = bufferedReader1.readLine()) != null)
{
if(pass.equals(temp1))
{
    System.out.println("correct password");
    for(int i=0;i<5;i++){
    display_quiz();
    
    }
    //option_select();
   
    break;
    
}

//fileReader1.close();
       
}
    if(!pass.equals(temp1))
{
       System.out.println("incorrect password"); 
}
          }
catch(Exception e) {    

  }  
}
    
}
