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
    public SequentialRepresentation() {
        // Implement me!
    } // end of SequentialRepresentation()

    @Override
    public void setRootNode(T nodeLabel) {
        // Implement me!
    } // end of setRootNode()

    @Override
    public void splitNode(T srcLabel, T leftChild, T rightChild) {
        // Implement me!
    } // end of splitNode

    @Override
    public boolean findNode(T nodeLabel) {
        // Implement me!
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