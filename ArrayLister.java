import java.util.Arrays;


public class ArrayLister <E>{

	private static  int size=0;
	private static final int CAPACITY=2;
	
	private Object [] listholder;
	
	public ArrayLister()
	{
		listholder = new Object[CAPACITY];
	}
	
	
	public void add(E element)
	{
		if(size==listholder.length)
		{
			 
			listholder=Arrays.copyOf(listholder, listholder.length*2);
			
		}
	
		
		listholder[size++]=element;
	}
	
	
	public E get(int i)
	{
	     return (E) listholder[i];	
	}
	
	
}
