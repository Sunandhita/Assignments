package question2;

// Question 2

import java.util.HashMap;
import java.util.Map;

public class MyGenericClass1<K,V>
{
	private K key;
	private V value;
	
	private HashMap<K,V> hm;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public HashMap<K, V> getHm() {
		return hm;
	}

	public void setHm(Map<K, V> hm) {
		this.hm = (HashMap<K, V>) hm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hm == null) ? 0 : hm.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyGenericClass1 other = (MyGenericClass1) obj;
		if (hm == null) {
			if (other.hm != null)
				return false;
		} else if (!hm.equals(other.hm))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
