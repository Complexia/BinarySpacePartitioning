public class Node<T>{

	private T name;
	private T parentNode;
	private T leftChildNode;
	private T rightChildNode;

	public Node(){

	}

	public Node(T name){
		this.name = name;
	}
	public Node(T name, T parentNode){
		this.name = name;
		this.parentNode = parentNode;
	}

	public T getName(){
		return name;
	}
	public void setName(T name){
		this.name = name;
	}
	public T getParentNode(){
		return parentNode;
	}
	public void setParentNode(T parentNode){
		this.parentNode = parentNode;
	}
	public T getLeftChildNode(){
		return leftChildNode;
	}
	public void setLeftChildNode(T leftChildNode){
		this.leftChildNode = leftChildNode;
	}
	public T getRightChildNode(){
		return rightChildNode;
	}
	public void setRightChildNode(T rightChildNode){
		this.rightChildNode = rightChildNode;
	}


}