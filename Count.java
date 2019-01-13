import java.io.*;
import java.util.*;
class Count{
     public static void main(String args[])
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int a=0;
          while(n>0){
             a=a+1;
             n=n/10;
             }
         System.out.println(a);
         }
    }
