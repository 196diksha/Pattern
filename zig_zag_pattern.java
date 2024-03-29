import java.util.*;
public class Star{
public static void main(String[] args){
    int n=15;
    for(int i=0;i<n;i++){
        for(int j=0;j<1;j++){
            if(i%4==0){
            System.out.println("*");
            }
            else if( i%2!=0 ){
            System.out.println(" " + "*");
            }
            else{
                System.out.println(" " + " " + " *");
            }
        }
    }
}
}

OUTPUT ->>

*
 *
   *
 *
*
 *
   *
 *
*
 *
   *
 *
*
 *
   *
