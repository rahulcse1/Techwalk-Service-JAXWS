package org.techwalk.service;

import net.webservicex.Country;
import net.webservicex.CountrySoap;

/**
 * 
 * @author techwalk
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 * http://webservicex.net/New/Home/Services/7
	 * http://www.webservicex.net/country.asmx?WSDL
	 * 
	 */
	public static void main(String[] args) {
		Country country = new Country();
		CountrySoap countrySoap = country.getCountrySoap();
		String countries = countrySoap.getCountries();
		System.out.println(countries);
	}
}
