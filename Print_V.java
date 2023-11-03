
public class Main
{
	public static void main(String[] args) {
	    int k=1;
	    for(int i=1;i<=5;i++){
	        for(int j=1;j<=9;j++){
	            if(i==j|| i+j==10){
	                
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
