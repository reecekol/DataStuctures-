
public class Map<K,V> {

	int size;
	private static final int CAPACITY =10;
	
    Entry [] entries = new Entry[CAPACITY];
	
	Map()
	{
		this.size=0;
	}
	public void put(K key,V val){
		
		
		entries[size++]= new Entry(key,val);
	}
	
	public V get(K key)
	{
	  for(int i=0; i<entries.length; i++)
	  {
		  if(entries[i].key==key){
			  
			  return (V) entries[i].value;
		  }
			  
	   }
	  
	   return null;
	  }
	}
	
	
	
