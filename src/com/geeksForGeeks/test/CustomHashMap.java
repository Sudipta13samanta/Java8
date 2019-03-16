package com.geeksForGeeks.test;

public class CustomHashMap<K, V> {
	private Entity<K, V>[] table;
	private int initialCapacity;

	static class Entity<K, V> {
		K key;
		V value;
		Entity<K, V> next;

		public Entity(K key, V value, Entity<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public CustomHashMap(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		this.table = new Entity[initialCapacity];
	}

	public void put(K newKey, V data) {
		if (newKey == null) {
			return;
		}

		int hashValue = hash(newKey);

		Entity<K, V> newEntity = new Entity<K, V>(newKey, data, null);

		if (table[hashValue] == null) {
			table[hashValue] = newEntity;
		} else {
			Entity<K, V> current = table[hashValue];

			while (current != null) {
				if (current.key.equals(newKey)) {
					newEntity.next = current.next;
					table[hashValue] = newEntity;
					return;
				} else if(current.next != null){
					current = current.next;
				}else{
					current.next = newEntity;
				}

			}

		}
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entity<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(key)) {
					return current.value;
				}
				current = current.next;
			}
		}
		return null;
	}

	private int hash(K newKey) {
		return newKey.hashCode() % initialCapacity;
	}
	
	public static void main(String s[]){
		CustomHashMap<String, Integer> map = new CustomHashMap<String, Integer>(6);
		map.put("SS", 2);
		map.put("SS", 3);
		System.out.println(map.get("SS"));
	}

}
