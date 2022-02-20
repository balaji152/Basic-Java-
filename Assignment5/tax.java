import java.util.Scanner;
public class tax {

	public static double calculateTaxAmount(int ctc){
	    double tax=0;
	 if (ctc <180000) {
		  tax =0;
		 
	 }	 

	 else if(ctc>=181001 && ctc <=300000) {
	     tax = (ctc/100)*10;
	 }

     else if(ctc>=300001 && ctc<=500000) { 
    	  tax = (ctc/100)*20; 
    	  
	 }

	 else if (ctc>=500001 && ctc<=1000000) {
	      tax = (ctc/100)*30;
	 }
	     return tax;
	}

	
	
}     
 