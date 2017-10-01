import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumNums {


//		C:\Users\Mariel\Documents\CECS 274\numbers.txt

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.print("Enter the path and name of the numbers file: ");
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		
		Scanner fileReader = null;
		try {
			
			File fileIn = new File(path);
			fileReader = new Scanner(fileIn);
			
			int sum = 0;
			String currentNum;
			try{
				while(fileReader.hasNext()){
					currentNum = fileReader.next();
	//				System.out.println(currentNum);
					sum += Integer.parseInt(currentNum);
				}
			} finally {
				
				fileReader.close();
				
			}
			
			System.out.println("Sum: " + sum);
		
		} catch (FileNotFoundException e) {
			
			System.out.println("File was not found.");
			
		} 
	}
}
