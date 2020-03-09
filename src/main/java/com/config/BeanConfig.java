package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coinconverter.CoinConverterFactory;


@Configuration
public class BeanConfig {

	@Bean
	public CoinConverterFactory coinConverterFactory(){
		return new CoinConverterFactory();
	}

}
