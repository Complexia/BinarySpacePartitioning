import java.io.PrintWriter;


/**
 * Linked Tree Representation implementation for the {@link BSPTree} interface.
 * <p>
 * Your task is to complete the implementation of this class.
 * You may add methods, but ensure your modified class compiles and runs.
 *
 * @author Jeffrey Chan, 2016. 
 * @author Yongli Ren, 2019.
 */
public class LinkedRepresentation<T> implements BSPTree<T> {

    Node root;
    private Node[] storage = new Node[10000];
    private int index = 0;

    /**
     * Constructs empty tree.
     */
    public LinkedRepresentation() {
        root = new Node();
    } // end of LinkedRepresentation()

    @Override
    public void setRootNode(T nodeLabel) {
        root.setName(nodeLabel);
        storage[index] = root;
        index++;
        
    } // end of setRootNode()

    @Override
    public void splitNode(T srcLabel, T leftChild, T rightChild) {
        
        for(int i=0;i<storage.length;i++){
            if(storage[i] != null){
                

                if(storage[i].getName().equals(srcLabel)){

                    storage[i].setLeftChildNode(leftChild);
                    storage[index + 1] = new Node(leftChild, srcLabel);
                    storage[i].setRightChildNode(rightChild);
                    storage[index + 2] = new Node(rightChild, srcLabel);
                    System.out.println(storage[index + 1].getParentNode());
                    index = index + 2;
                }
            }
        } 
    } // end of splitNode

    @Override
    public boolean findNode(T nodeLabel) {
        for(int i=0;i<storage.length;i++){
            if(storage[i] != null){
                if(storage[i].getName().equals(nodeLabel)){
                    return true;
                }
            }
        }
        return false;
    } // end of findNode

    @Override
    public String findParent(T nodeLabel) {
        for(int i=0;i<storage.length;i++){
            if(storage[i] != null){
                if(storage[i].getName().equals(nodeLabel)){
                    return (String)storage[i].getParentNode();
                }
            }
        }
        return null;
    } // end of findParent

    @Override
    public String findChildren(T nodeLabel) {
        for(int i=0;i<storage.length;i++){
            if(storage[i] != null){
                if(storage[i].getName().equals(nodeLabel)){
                    if(storage[i].getLeftChildNode() != null){
                        return (String)storage[i].getLeftChildNode();
                    }
                    
                }
            }
        }
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

} // end of class LinkedRepresentation
