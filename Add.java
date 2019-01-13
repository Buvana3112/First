import java.io.*;
import java.util.*;
class Add{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int d=0;
         int[] c=new int[a];
         for(int i=0;i<a;i++){
            c[i]=s.nextInt();
            }
         for(int j=0;j<b;j++){
            d=d+c[j];
            }
         System.out.println(d);
         }
   }
