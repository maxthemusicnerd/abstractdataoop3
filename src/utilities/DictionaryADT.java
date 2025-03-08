package utilities;


/**
* DictionaryADT.java
*
* @author Maxim Oleshko
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{

	//insert a new pair
	
	void insertNewPair(K k, V v);
	
	//return a value by passing in its key
	
	V getValueByKey(K k);
	
	//removes a pair from the dictionary based on its key
	
	void removePair(K k);
	
	//updates the value of a Value when a key is fed in 
	
	void updateValue(K k);
	

}
