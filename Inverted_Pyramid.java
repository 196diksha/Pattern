import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   	for(int i=6;i>=1;i--){
	    	    for(int j=1;j<=6-i;j++){ ///space
	    	        System.out.print(" ");
	    	    }
	    	    for(int j=1;j<=2*i-1;j++){
	    	         System.out.print("*");
	    	}
	        System.out.println();
	    	}
	   	}
}
