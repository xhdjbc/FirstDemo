import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class FirstDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String userName;
		double firstNum;
		double secondNum;
		
		double sum;
		double difference;
		double product;
		
	
        System.out.println("Hello user!");
        
        System.out.print("What is your name?");
        userName = userInput.nextLine();
        
        System.out.print("Think of a number:");
        firstNum = userInput.nextDouble();
        
        System.out.print("Think of another number:");
        secondNum = userInput.nextDouble(); 
        

        
        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        product = firstNum * secondNum;
		
        
        System.out.println("\n" + userName + "? That's a cool name!");
        //String.Format("Your sum:(0,10,0)")
        System.out.println( String.format("Your sum:%17.2f", sum) );
        System.out.println( String.format("Your difference:%10.2f", difference) );
        System.out.println( String.format("Your product:%13.2f", product) );
        
        userInput.close();
	}

}
