import java.io.*;
import java.util.*;
class Alphabet{
     public static void main(String args[]){
           Scanner s=new Scanner(System.in);
           char ch=s.nextChar();
           if(ch >= 'a' && ch<='z' || ch>='A' && ch<='Z')
               System.out.println("Alphabet");
           else 
               System.out.println("No");
           }
    }
           
