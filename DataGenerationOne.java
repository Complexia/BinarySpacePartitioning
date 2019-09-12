import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.*;
public class DataGenerationOne{
	
	public static void main(String[]args){

		SequentialRepresentation sqR = new SequentialRepresentation();
		LinkedRepresentation lR = new LinkedRepresentation();
		
		initializeTree(sqR);
		initializeTree(lR);

		// System.out.println(sqR.findParent("3641"));
		// System.out.println(lR.findParent("3641"));
		
		ArrayList<Integer> nodes = new ArrayList<Integer>();
		//Adding 5000 nodes to initial BSP
		Random r = new Random();
		String node1 = "3628";
		

		//Testing Scenario 1 for sqR
		// long start = System.nanoTime();
		// for(int i=0;i<nodes.size();i+=2){

		// 	sqR.splitNode(node1,Integer.toString(nodes.get(i)),Integer.toString(nodes.get(i+1)));
		// 	node1 = Integer.toString(nodes.get(i));
		// }
		// long finish = System.nanoTime();
		// long timeElapsed = finish - start;

		// System.out.println(timeElapsed);

		//Testing Scenario 1 for lR
		long start = System.nanoTime();
		for(int i=0;i<nodes.size();i+=2){

			sqR.splitNode(node1,Integer.toString(nodes.get(i)),Integer.toString(nodes.get(i+1)));
			node1 = Integer.toString(nodes.get(i));
		}
		long finish = System.nanoTime();
		long timeElapsed = finish - start;

		System.out.println(timeElapsed);



		
	}

	public static void initializeTree(BSPTree tree){

		try(BufferedReader br = new BufferedReader(new FileReader("BSP_combined.txt"))) {


	    	StringBuilder sb = new StringBuilder();
	    	String line = br.readLine();

	    	// sqR.setRootNode(line);
	    	// lR.setRootNode(line);
	    	tree.setRootNode(line);

	    	while(line != null){
	    		line = br.readLine();
	    		if(line != null){
	    			String[] splited = line.split(" ");


	    			// sqR.splitNode(splited[0],splited[1],splited[2]);
	    			// lR.splitNode(splited[0],splited[1],splited[2]);
	    			tree.splitNode(splited[0],splited[1],splited[2]);

	    		}
	    		  		
	    	}
	    	
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
	}

	public static void generateNodes(List nodes){

		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1000; i<4000; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<2999; i++) {
            nodes.add(list.get(i));
        }
	}

}