import java.util.Scanner;

public class ProductServiceClass {
	Scanner sc=new Scanner(System.in);
	public void productService(){
		System.out.println("1. import product data\n 2. check product data \n 3. check invoice");
		switch(sc.nextInt()){
		case 1:
		{
			System.out.println("import data");
			break;
		}
		case 2:
		{
			System.out.println("read data");
			break;
		}
		case 3:
		{
			System.out.println("Display invoice");
			break;
		}
		default:
			System.out.println();
		}
		
	}

}
