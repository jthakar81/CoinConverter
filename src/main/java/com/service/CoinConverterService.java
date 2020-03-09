package com.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coinconverter.CoinConverter;
import com.coinconverter.CoinConverterFactory;
import com.coinconverter.CoinConverterUS;
import com.model.Coin;

@RestController
public class CoinConverterService {

	@Autowired
	CoinConverterFactory cf;
	
	@GetMapping("/coinService")
	public String convertToCoin(@RequestParam("currency") String currency,@RequestParam("bill") String billamont) {
		Map  results = null;
		StringBuilder result = new StringBuilder();
		try{
			CoinConverter cc = cf.getConverter(currency);
			if(cc==null)throw new Exception("Currency Not Supported");
			results = cc.convert(Integer.parseInt(billamont));
			
			Iterator<Entry<Coin, Integer>> it = results.entrySet().iterator();
			while(it.hasNext()){
				
				Map.Entry <Coin,Integer> entry = it.next();
				result.append(entry.getValue() + " " + (entry.getValue()==1?entry.getKey():entry.getKey()+"s") + ",  " );
				
			}
			
			return result.toString();
			
		}catch(NumberFormatException ex){
			ex.printStackTrace();
			result.append("Error While Converting to Coin :- Invlid Bill Amunt");
			return result.toString();
		}catch(Exception e){
			e.printStackTrace();
			result.append("Error While Converting to Coin :- " + e.getMessage());
			return result.toString();
		}
		
		
	}
	
	

}
