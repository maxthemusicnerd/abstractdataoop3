package utilities;

import exceptions.ExistingKeyException;
import exceptions.KeyNotFoundException;

/**
* DictionaryADT.java
*
* @author Maxim Oleshko / Aishte Pitpit / Maxim Lopez
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
* 
* @param <K> Type of key (must be unique)
* @param <V> Type of value
*/

public interface DictionaryADT<K,V>
{

	/**
     * Inserts a new key-value pair into the dictionary.
     *
     * Preconditions: The key must be unique and non-null.
     * 
     * Postconditions: The key-value pair is added to the dictionary.
     *
     * @param k	the key to be added
     * @param v	the value to be associated with the key
     * @throws DuplicateKeyException if the key already exists in the dictionary
     */
	void insertNewPair(K k, V v) throws ExistingKeyException;
	
	/**
     * Removes a key-value pair from the dictionary based on the key.
     *
     * Preconditions: The key must exist in the dictionary.
     * 
     * Postconditions: The key-value pair is removed from the dictionary.
     *
     * @param key the key whose entry is to be removed
     * @return the value associated with the removed key
     * @throws KeyNotFoundException if the key does not exist in the dictionary
     */
	V removePair(K k) throws KeyNotFoundException;
	
	/**
     * Looks up and retrieves the value associated with a given key.
     *
     * Preconditions: The key must exist in the dictionary.
     * 
     * Postconditions: The value associated with the key is returned.
     *
     * @param key the key to be searched for
     * @return the value associated with the key
     * @throws KeyNotFoundException if the key does not exist in the dictionary
     */
	V getValueByKey(K k) throws KeyNotFoundException;
	
	/**
     * Updates the value of an existing key in the dictionary.
     *
     * Preconditions: The key must exist in the dictionary.
     * 
     * Postconditions: The associated value is updated with the new value.
     *
     * @param key the key whose value is to be updated
     * @param value the new value to be assigned to the key
     * @throws KeyNotFoundException if the key does not exist in the dictionary
     */
	void updateValue(K k, V v) throws KeyNotFoundException;
	

}
