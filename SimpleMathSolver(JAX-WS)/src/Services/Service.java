package Services;

import java.util.Random;

public class Service {
	
	Random R1=new Random();
	int Low = 10;
	int High = 100;
	int number = R1.nextInt(High-Low) + Low;

	

public void find_prime(){
	
	if (number>1000 || number<1)
	{
	System.out.println("Input Is not valid. Enter number between 1 and 1000");
	}
boolean flag=true;
//int n=0;
//int[] result={};

System.out.println("Input Number is" + number);
System.out.println("Primes are");
for (int i=1; i<=number; i++)
	{
	 if(i==1||i==2||i==3)
		 
		 {
		 flag=true;
		 }
	 else
		 {
		 
		 for (int j=2; j<i; j++){
		 
			 if(i%j!=0)
				 {
				 flag=true;
				 }		
			 else
				 {
				 flag=false;
				 break;
				 }
		 }
		 
		 }
	 
	 
	 if(flag)
	 {
		 System.out.println(i);
	// result[n]=i;
	 //System.out.println("......"+result[n]);
	 //n++;
	 //System.out.println(n);
	 //System.out.println(i);
	 }
	}
	//int l=result.length;
	//System.out.println("Primes are");
    //for (int k=0; k < l; k++  ){
    	//System.out.println("/n"+ result[k]);
    	
    }



public void check_prime(){
	
	boolean flag=true;
	if (number>1000 || number<1)
	{
		System.out.println("Input Is not valid. Enter number between 1 and 1000");
	}
	    if(number == 1) {System.out.println("not a prime");}
	    else if(number== 2) { System.out.println("is a prime");}
	    else if(number==3) { System.out.println("is a prime");}
	    else { 
	        for(int i=(int) Math.floor(Math.sqrt(number));i>=2;i--){
	            
	                if(number%i==0 || number%2==0 || number%3==0) {flag=false;} 
	        } 
	        }
	    if(flag)
	    	{
	    	System.out.println(number + "is a prime");
	    	}
	    else
	    	{
	    	System.out.println(number + "not a prime");
	    	}
}
}


