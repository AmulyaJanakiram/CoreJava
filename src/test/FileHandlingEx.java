package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "to err is human";
		FileOutputStream file1;
		
		try {
			file1 = new FileOutputStream ("results.txt", true); //relative path, true will append the data and false will override
			file1.write(str.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
