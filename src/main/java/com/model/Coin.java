package com.model;

public class Coin implements Comparable<Coin> {
	
	String displayName=null;
	Integer valueinCent=0;
		
	public Coin(String displayeName, Integer valueinCent) {
		this.displayName=displayeName;
		this.valueinCent=valueinCent;
	}

	@Override
	public int compareTo(Coin o) {
		return o.getValueinCent().compareTo(this.getValueinCent());
		
	}

	public String getDisplayName() {
		return displayName;
	}

	public Integer getValueinCent() {
		return valueinCent;
	}

	@Override
	public int hashCode() {
		
		return getValueinCent().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.valueinCent.equals(((Coin)obj).getValueinCent());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDisplayName();
	}

	

}
