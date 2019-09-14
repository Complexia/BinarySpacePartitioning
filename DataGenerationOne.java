import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.*;
import java.io.*;
public class DataGenerationOne{

	static ArrayList<String> nodes2 = new ArrayList<String>(); //Nodes to be searched for for Scenario 2
	public static void main(String[]args){

		SequentialRepresentation sqR = new SequentialRepresentation();
		LinkedRepresentation lR = new LinkedRepresentation();
		
		initializeTree(sqR);
		initializeTree(lR);

		//sqR.printInPreorder(new PrintWriter(new FileOutputStream("log.txt")));
		
		ArrayList<Integer> nodes1 = new ArrayList<Integer>(); //Nodes to be added for Scenario 1
		
		
		
		String node1 = "3628";
		

		//Testing Scenario 1 for sqR
		// generateNodes(nodes1);
		// long start = System.nanoTime();
		// for(int i=0;i<nodes1.size();i+=2){

		// 	sqR.splitNode(node1,Integer.toString(nodes1.get(i)),Integer.toString(nodes1.get(i+1)));
		// 	node1 = Integer.toString(nodes1.get(i));
		// }
		// long finish = System.nanoTime();
		// long timeElapsed = finish - start;

		// System.out.println(timeElapsed);

		//Testing Scenario 1 for lR
		// generateNodes(nodes1);
		// long start = System.nanoTime();
		// for(int i=0;i<nodes1.size();i+=2){

		// 	sqR.splitNode(node1,Integer.toString(nodes1.get(i)),Integer.toString(nodes1.get(i+1)));
		// 	node1 = Integer.toString(nodes1.get(i));
		// }
		// long finish = System.nanoTime();
		// long timeElapsed = finish - start;

		// System.out.println(timeElapsed);

		//Testing for Scenario 2 sqR
		//Random r = new Random();

		//Performing 5000 searches

		// long start = System.nanoTime();
		// for(int i=0;i<5000;i++){
		// 	int testIndex = r.nextInt(nodes2.size());
		// 	sqR.findNode(nodes2.get(testIndex));
		// 	sqR.findParent(nodes2.get(testIndex));
		// 	sqR.findChildren(nodes2.get(testIndex));
		// }
		// long finish = System.nanoTime();
		// long timeElapsed = finish - start;
		// System.out.println(timeElapsed);


		//Testing for Scenario 2 lR
		//Random r = new Random();

		//Performing 5000 searches
		
		// long start = System.nanoTime();
		// for(int i=0;i<5000;i++){
		// 	int testIndex = r.nextInt(nodes2.size());
		// 	lR.findNode(nodes2.get(testIndex));
		// 	lR.findParent(nodes2.get(testIndex));
		// 	lR.findChildren(nodes2.get(testIndex));
		// }
		// long finish = System.nanoTime();
		// long timeElapsed = finish - start;
		// System.out.println(timeElapsed);



		
	}

	public static void initializeTree(BSPTree tree){

		try(BufferedReader br = new BufferedReader(new FileReader("BSP_combined.txt"))) {


	    	StringBuilder sb = new StringBuilder();
	    	String line = br.readLine();

	    	
	    	tree.setRootNode(line);

	    	while(line != null){
	    		line = br.readLine();
	    		if(line != null){
	    			String[] splited = line.split(" ");


	    			
	    			tree.splitNode(splited[0],splited[1],splited[2]);

	    			//For scenario 2 below

	    			nodes2.add(splited[0]);
	    			nodes2.add(splited[1]);
	    			nodes2.add(splited[2]);

	    		}
	    		  		
	    	}
	    	
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
	}

	public static void generateNodes(List nodes){

		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10000; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<10000; i++) {
            nodes.add(list.get(i));
        }
	}

}