package com.capgemini.assignments.model;

import java.util.HashMap;
import java.util.Map;

public class StatePersonDictionary {

		private HashMap<String, AddressBook> statePersonDictionary = new HashMap();

		public HashMap<String, AddressBook> getStatePersonDictionary() {
			return statePersonDictionary;
		}

		public void setStatePersonDictionary(HashMap<String, AddressBook> statePersonDictionary) {
			this.statePersonDictionary = statePersonDictionary;
		}
		public void addPerson(String stateName, Contact contact)
		{
			boolean check = statePersonDictionary.keySet().stream().noneMatch(city -> city.equalsIgnoreCase(stateName));
			if(check) {
				AddressBook addressBook = new AddressBook();
				addressBook.addContactToAddressBook(contact);
				statePersonDictionary.put(stateName, addressBook);
			}
			else {
				for(Map.Entry<String, AddressBook> entry : statePersonDictionary.entrySet()) {
					if(entry.getKey().equalsIgnoreCase(stateName)) 
						entry.getValue().addContactToAddressBook(contact);
				}
			}
		}

		public void removePerson(String state, Contact contact) {

			for(Map.Entry<String, AddressBook> entry : statePersonDictionary.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(state)) 
					entry.getValue().removeContact(contact.getFirstName(), contact.getLastName());
		}
		}
	
		

	}


