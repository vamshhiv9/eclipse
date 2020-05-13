import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class mymain {

	public static void main(String[] args) {
		String filename = "F:\\jaya vamshhi\\basic2\\src\\input";
		File file = new File(filename);
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(file);
			
			ANTLRInputStream input = new ANTLRInputStream(fis);
			a1Lexer lexer = new a1Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			a1Parser parser = new a1Parser(tokens);
			parser.rohith();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}