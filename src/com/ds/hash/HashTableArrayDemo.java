package com.ds.hash;

public class HashTableArrayDemo {
	public static void main(String[] args) {
		HashTableArray<String> hm = new HashTableArray<String>(10);
		hm.put(11,"Tim");
		hm.put(12,"Jim");
		hm.put(13,"Bin");
		hm.put(14,"Din");
		System.out.println(hm.get(13));
	}
}
