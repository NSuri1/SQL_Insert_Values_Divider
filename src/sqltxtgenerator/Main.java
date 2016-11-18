package sqltxtgenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		final String insert = "INSERT INTO USER_DETAILS VALUES ";
		File file = new File("values.txt");
		File file2 = new File("sql.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String value;
		

		while((value = reader.readLine()) != null){
			char[] charArr = value.toCharArray();
			writer.write(insert);
			writer.newLine();
			writer.write(charArr, 0, charArr.length - 1);
			writer.write(";");
			writer.newLine();
			writer.flush();
		}
		
		writer.close();
		reader.close();
		
		
	}

}
