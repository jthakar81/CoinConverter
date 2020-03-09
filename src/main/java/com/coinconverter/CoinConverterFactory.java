package com.coinconverter;


public class CoinConverterFactory {

	 public CoinConverterFactory() {
		// TODO Auto-generated constructor stub
	}

	public CoinConverter getConverter(String currentcy){
		
		if(currentcy == null || currentcy.trim()==null){
			return null;
		}else if(currentcy.equals("US")){
			return new CoinConverterUS();
		}
		return null;
		
	}
	 
}
