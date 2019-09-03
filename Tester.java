import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Tester {
	
	
	public static void main(String[]args) {
		
		
		SequentialRepresentation sqR = new SequentialRepresentation();
		sqR.setRootNode("A");
		sqR.splitNode("A", "B", "C");
		sqR.splitNode("B", "D", "E");
		System.out.println(sqR.findParent("E"));
		try {
			sqR.printInPreorder(new PrintWriter(new FileOutputStream("log.txt")));
		}
		catch(Exception e) {
			System.out.println("fail");
		}
		
		
	}
}
