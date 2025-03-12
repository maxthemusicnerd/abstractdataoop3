package implementations;

import java.util.ArrayList;

import exceptions.*;

import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	private int size;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	
	public Dictionary() {
        this.create(DEFAULT_SIZE); 
    }
	
	public Dictionary(int size) {
        this.create(size);
    }
	
	@Override
    public void create(int size) {
        this.size = size;
        this.keys = new ArrayList<>(size);
        this.values = new ArrayList<>(size);
    }
	
	@Override
    public boolean insert(K key, V value) throws DuplicateKeyException {
        if (keys.contains(key)) {
            throw new DuplicateKeyException("Key already exists: " + key);
        }
        keys.add(key);
        values.add(value);
        return true;
    }
	
	@Override
    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
	
	@Override
    public boolean update(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
            return true;
        }
        return false;
    }
	
	@Override
    public V lookup(K key) {
        int index = keys.indexOf(key);
        return (index != -1) ? values.get(index) : null;
    }
	
	
}
