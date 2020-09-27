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
		
		public Contact updateContact(String firstName, String lastName) {
			Contact contactSearch = null;
			for(Contact contact : addressBook)
			{
				if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
					contactSearch = contact;
					break;
				}
			}
			
			return contactSearch;			
		}
		
		public boolean removeContact(String firstName, String lastName) {
			boolean remove = false;
			for(Contact contact : addressBook)
			{
				if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
					addressBook.remove(contact);
					remove = true;
					break;
				}
			}
			return remove;
		}

}
