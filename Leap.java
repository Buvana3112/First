import java.io.*;
import java.util.*;
class Leap{
     public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          boolean b=false;
          if(n%4==0){
              if(n%100==0){
                 if(n%400==0)
                     System.out.println("Yes");
                 else
                     System.out.println("No");
              }
          else
             System.out.println("No");
         }
   }
