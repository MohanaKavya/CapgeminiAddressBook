package com.capgemini.assignments.model;

import java.util.TreeMap;

public class AddressBookDictionary {
	
		private TreeMap<String, AddressBook> addressBookDictionary = new TreeMap<String, AddressBook>();
		
		public TreeMap<String, AddressBook> getAddressBookDictionary() {
			return this.addressBookDictionary;
		}
		
		public void setAddressBookDictionary (TreeMap<String, AddressBook> addressBookDictionary) {
			this.addressBookDictionary = addressBookDictionary;
		}
		
		public void addAddressBook(String name, AddressBook addressBook)
		{
			addressBookDictionary.put(name, addressBook);
		}
		

}
