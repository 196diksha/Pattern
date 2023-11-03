
public class Main
{
	public static void main(String[] args) {
	    int k=1;
	    for(int i=1;i<=6;i++){
	        for(int j=1;j<=5;j++){
	            if( j==1 ||i==1 || (j==5 & i<4 ) || i==3|| (i+j==k)){
	                
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        	System.out.println();
	        	k=k+2;
	    }
	    
	}
}
