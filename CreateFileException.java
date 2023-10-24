import java.io.File;   //Import the FileClass
import java.io.IOException;
public class CreateFileException{
	public static void main(String[] args){
		try{
			File myObj = new File("filename.txt");
			if (myObj.createNewFile()){
				System.out.println("File created: " + myObj.getName());
			}
			else{
				System.out.println("File already exists");
			}
		}
		catch(ArithmeticException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}