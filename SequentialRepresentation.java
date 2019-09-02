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
    
    private T[] tree = new T[1000];

    public SequentialRepresentation() {
        
        //tree = new T[1000];
    } // end of SequentialRepresentation()

    @Override
    public void setRootNode(T nodeLabel) {
        
        tree[1] = nodeLabel;
    } // end of setRootNode()

    @Override
    public void splitNode(T srcLabel, T leftChild, T rightChild) {
        
        T currentNode = tree[1];
        for(int i=1;i<tree.length;i++){
            if(srcLabel.equals(currentNode)){
                tree[i*2] = leftChild;
                tree[i*2+1] = rightChild;
            }
            else{
                currentNode = tree[i];
            }
        }

    } // end of splitNode

    @Override
    public boolean findNode(T nodeLabel) {
        
        return false;
    } // end of findNode

    @Override
    public String findParent(T nodeLabel) {
        // Implement me!
        return null;
    } // end of findParent

    @Override
    public String findChildren(T nodeLabel) {
        // Implement me!
        return null;
    } // end of findParent

    @Override
    public void printInPreorder(PrintWriter writer) {
        // Implement me!
    } // end of printInPreorder

    @Override
    public void printInInorder(PrintWriter writer) {
        // Implement me!
    } // end of printInInorder

    @Override
    public void printInPostorder(PrintWriter writer) {
        // Implement me!
    } // end of printInPostorder

} // end of class SequentialRepresentation