package com.capgemini.assignments.model;

import java.util.HashMap;
import java.util.Map;

public class CityPersonDictionary {

	private HashMap<String, AddressBook> cityPersonDictionary = new HashMap();
		
		
		public HashMap<String, AddressBook> getCityPersonDictionary() {
		return cityPersonDictionary;
	}


	public void setCityPersonDictionary(HashMap<String, AddressBook> cityPersonDictionary) {
		this.cityPersonDictionary = cityPersonDictionary;
	}


		public void addPerson(String cityName, Contact contact)
		{
			boolean check = cityPersonDictionary.keySet().stream().noneMatch(city -> city.equalsIgnoreCase(cityName));
			if(check) {
				AddressBook addressBook = new AddressBook();
				addressBook.addContactToAddressBook(contact);
				cityPersonDictionary.put(cityName, addressBook);
			}
			else {
				for(Map.Entry<String, AddressBook> entry : cityPersonDictionary.entrySet()) {
					if(entry.getKey().equalsIgnoreCase(cityName)) 
						entry.getValue().addContactToAddressBook(contact);
				}
			}
		}

		public void removePerson(String city, Contact contact) {

			for(Map.Entry<String, AddressBook> entry : cityPersonDictionary.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(city)) 
					entry.getValue().removeContact(contact.getFirstName(), contact.getLastName());
		}
		}
	

}
