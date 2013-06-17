
public class Node {
   
	public Node next;
	
	public int data;
	public Node(int data)
	{
		this.data=data;
	}
	
	public void append( int d){
		
		Node lastnode = new Node(d);
		
		Node n=this;
		
		while(n.next!=null){
			n=n.next;
		}
		n.next=lastnode;
	}
	
	public void printNodes(){
		
		Node n=this;
		while (n!=null){
		
			System.out.println(n.data);
			n=n.next;
		}
		
	}
}
