package com.springcore.standalone.collections;
import java.util.*;
public class Person {
	private List<String> friends;
	private Map<String,Integer> feeStruct;
	private Properties properties;
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStruct() {
		return feeStruct;
	}

	public void setFeeStruct(Map<String, Integer> feeStruct) {
		this.feeStruct = feeStruct;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStruct=" + feeStruct + "]";
	}

	
	
	
}
