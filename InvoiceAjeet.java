import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
public class InvoiceAjeet {
	
	public void Invoice(int b,float originalBill,float finalBill,int gst,float z, String productName){
		 	
		
		try{
			//File f=new File("myInvoice.txt");
			PrintStream f=new PrintStream("myInvoice.txt");
			//FileWriter fw=new FileWriter(f);
			System.setOut(f);
			f.println("*****Invoice generated******");
			f.println("----------------------------");
			f.println("products  quantity  Bill ");
			f.println("----------------------------");
			f.printf("%1$4s %2$10s %3$10.2f%n", productName, b, originalBill);
			f.println("----------------------------");
			f.println("Total: " + finalBill + " (" + originalBill + "Rs + " + gst + "% GST i.e. "
							+ z+"Rs)");						
			f.close();			
		}
		catch (IOException io)
		{
			
		}		
	}
}

