import java.io.*;
import java.util.*;
class Vowel{
     public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          char ch=s.nextChar();
          if( ch >= 'a' && ch <= 'z'){
               if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                    System.out.println("Vowel");
               else
                    System.out.println("Consonant");
               }
          else 
               System.out.println("Invalid");
         }
    }
