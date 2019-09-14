import java.io.PrintWriter;


/**
 * Sequential Tree Representation implementation for the {@link BSPTree} interface.
 * <p>
 * Your task is to complete the implementation of this class.
 * You may add methods, but ensure your modified class compiles and runs.
 *
 * @author Jeffrey Chan, 2016.
 * @author Yongli Ren, 2019.
 */
 
 
public class SequentialRepresentation<T> implements BSPTree<T> {

    /**
     * Constructs empty graph.
     */
    
    private T[] tree;

    public SequentialRepresentation() {
        
        tree = (T[]) new Object[100000000];
    } // end of SequentialRepresentation()

    @Override
    public void setRootNode(T nodeLabel) {
        
        tree[1] = nodeLabel;
    } // end of setRootNode()

    @Override
    public void splitNode(T srcLabel, T leftChild, T rightChild) {
        
        T currentNode = tree[1];
        for(int i=1;i<tree.length;i++){
            
        	if(tree[i] != null) {
        		if(tree[i].equals(srcLabel)) {
        			tree[i*2] = leftChild;
                    tree[i*2+1] = rightChild;
                    break;
        		}
        		
        	}
             
        }

    } // end of splitNode

    @Override
    public boolean findNode(T nodeLabel) {
        
    	for(int i=0;i<tree.length;i++) {
            if(tree[i] != null){
                if(tree[i].equals(nodeLabel)) {
                return true;
                }
            }
    		
    	}
        return false;
    } // end of findNode

    @Override
    public String findParent(T nodeLabel) {
        for(int i=0;i<tree.length;i++) {
        	if(tree[i] != null) {
        		if(tree[i].equals(nodeLabel)) {
        			
            		return (String)tree[i/2];
            	}
        	}
        	
        }
        return null;
    } // end of findParent

    @Override
    public String findChildren(T nodeLabel) {
        
    	for(int i=0;i<tree.length;i++) {
        	if(tree[i] != null) {
        		if(tree[i].equals(nodeLabel)) {
            		return (String)tree[i*2];
            	}
        	}
        	
        }
    	
        return null;
    } // end of findChildren

    @Override
    public void printInPreorder(PrintWriter writer) { //root left right
        for(int i=0;i<tree.length;i++) {
        	if(tree[i] != null) {
        		
        		writer.print(tree[i]); //as represented
        	}
        }
    } // end of printInPreorder

    @Override
    public void printInInorder(PrintWriter writer) { //left root right
        
    	int cN = 1;
    	while(tree[cN] != null) {
    		if(tree[cN*2] != null) {
    			cN = cN * 2;
    		}
    		else {
    			break;
    		}
    	}
    	while(cN != 1) {
    		writer.print(tree[cN]); //left
    		writer.print(tree[cN/2]); //root
    		writer.print(tree[cN+1]); //right
    		cN = cN/2;
    	}
    	
    	
    } // end of printInInorder

    @Override
    public void printInPostorder(PrintWriter writer) { //left right root
        int cN = 1;
        while(tree[cN] != null) {
            if(tree[cN*2] != null) {
                cN = cN * 2;
            }
            else {
                break;
            }
        }
        while(cN != 1) {
            writer.print(tree[cN/2]); //left
            writer.print(tree[cN+1]); //right
            writer.print(tree[cN]);  //root
            cN = cN/2;
        }
    } // end of printInPostorder

} // end of class SequentialRepresentation