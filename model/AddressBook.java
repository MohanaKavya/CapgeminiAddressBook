package com.capgemini.assignments.model;

import java.util.ArrayList;

public class AddressBook {
	
		private ArrayList<Contact> addressBook = new ArrayList<Contact>();
	
		public ArrayList<Contact> getAddressBook() {
			return this.addressBook;
		}
	
		public void setAddressBook(ArrayList<Contact> addressBook) {
			this.addressBook = addressBook;
		}
		
		public void addContactToAddressBook(Contact contact) {
			addressBook.add(contact);
		}

}
