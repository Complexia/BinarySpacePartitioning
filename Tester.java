import java.io.PrintWriter;

public class Tester {
	
	
	public static void main(String[]args) {
		
		
		SequentialRepresentation sqR = new SequentialRepresentation();
		sqR.setRootNode("A");
		sqR.splitNode("A", "B", "C");
		System.out.println(sqR.findParent("A"));
		sqR.printInPreorder(new PrintWriter(OutputStream out));
		
	}
}
