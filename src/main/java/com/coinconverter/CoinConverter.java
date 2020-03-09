/**
 * 
 */
package com.coinconverter;

import java.util.Map;
import java.util.TreeSet;

import com.model.Coin;

/**
 * @author Janardankumar
 *
 */
public interface CoinConverter {
	
	public Map <Coin,Integer> convert(Integer bill);

}
