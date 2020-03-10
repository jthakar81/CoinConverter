package com.coinconverter;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.model.Coin;

public class CoinConverterIndia implements CoinConverter {
	private  TreeSet<Coin> treeSet   = new TreeSet<Coin>();
	
	 {
		 treeSet.add(new Coin("2 rupee coin",200));
		 treeSet.add(new Coin("50 Paisa coin",50));
		 treeSet.add(new Coin("25 Paisa coin",25));
		 treeSet.add(new Coin("10 Paisa coin",10));
		 treeSet.add(new Coin("1 Paisa coin",1));
		 
	}
	
	public CoinConverterIndia() {
	
		
	}

	@Override
	public Map <Coin,Integer> convert(Integer bill) {
		Integer numOfCoins = 0;
		Map <Coin,Integer> resultMap = new TreeMap<Coin,Integer>(); 
		Iterator<Coin> it =treeSet.iterator();
		while(it.hasNext()){
			Coin i = it.next();
			if (i.getValueinCent() > bill)continue;

			numOfCoins =  bill/i.getValueinCent();
			resultMap.put(i,numOfCoins);
			bill=bill - numOfCoins * i.getValueinCent();
			
			if(bill==0)break;
		}
		
		return resultMap;
	}
	
	
		
	
}
