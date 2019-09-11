import java.io.BufferedReader;
import java.io.FileReader;
public class DataGenerationOne{

	public static void main(String[]args){

		SequentialRepresentation sqR = new SequentialRepresentation();
		try(BufferedReader br = new BufferedReader(new FileReader("BSP_combined.txt"))) {


	    	StringBuilder sb = new StringBuilder();
	    	String line = br.readLine();
	    	sqR.setRootNode(line);
	    	while(line != null){
	    		line = br.readLine();
	    		if(line != null){
	    			String[] splited = line.split(" ");
	    			sqR.splitNode(splited[0],splited[1],splited[2]);
	    		}
	    		
	    		//System.out.println(line);

	    	}
	    	

    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}

		
	}
}