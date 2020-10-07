package com.capgemini.assignments.controller;

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

import com.capgemini.assignments.model.*;

public class AddressBookMain {

	public static void main(String[] args) {
			
			// Display Welcome Message
			System.out.println("Welcome to Address Book Program");
			
			Scanner sc = new Scanner(System.in);
			
			// Instantiation of AddressBookDictionary Class
			AddressBookDictionary addressBookDictionary = new AddressBookDictionary();
			
			while(true) {
			System.out.println("1. Add New Address Book\n2.Exit\nEnter your Choice :");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("Enter the Address Book Name : ");
				sc.nextLine();
				String addressBookName = sc.nextLine();
			
			// Instantiation of AddressBook Class
			AddressBook addressBook = new AddressBook();
			
			addressBookDictionary.addAddressBook(addressBookName, addressBook);
			
			int option = 0;
			
			while(option != 4) {
				
				System.out.println("Menu \n1 : Add Contact to Address Book\n2 : Update Existing Contact\n3 : Remove Contact\n4 : Exit\nEnter your Choice :");
				option = sc.nextInt();
				
				switch(option) {
					// To Take Console Input for Contact Details
					case 1 : System.out.println("Enter First Name : ");
							 String first_name = sc.next();
							 System.out.println("Enter Last Name : ");
							 String last_name = sc.next();
							 sc.nextLine();
							 System.out.println("Enter Address : ");
							 String address = sc.nextLine();
							 System.out.println("Enter City : ");
							 String city = sc.nextLine();
							 System.out.println("Enter State : ");
							 String state = sc.nextLine();
							 System.out.println("Enter Zip : ");
							 Long zip_code = sc.nextLong();
							 System.out.println("Enter Phone Number : ");
							 Long phone_no = sc.nextLong();
							 System.out.println("Enter Email ID : ");
							 String email = sc.next();
							 
							boolean duplicateCheck = (addressBook.getAddressBook()).stream().noneMatch(Contact -> Contact.getFirstName().equals(first_name) && Contact.getLastName().equals(last_name));                              
							 
							 if(duplicateCheck) {
							 // Instantiation of Contact Class
							 Contact contact = new Contact(first_name, last_name, address, city, state, zip_code, phone_no, email);
							
							 // Add New Contact into Address Book
							 addressBook.addContactToAddressBook(contact);
							 System.out.println("done");
							 }
							 break;
							 
					case 2 : // Console input to take First and Last Names to Update Contact
							 System.out.println("Enter your First Name to Enable Updating your Contact : ");
							 String firstName = sc.next();
							 System.out.println("Enter your Second Name to Enable Updating your Contact : ");
							 String lastName = sc.next();
							 
							 // Updating Contact
							 Contact contactUpdate = addressBook.updateContact(firstName, lastName);
							 if(contactUpdate == null)
							 {
								 System.out.println("Contact Not Available. Please try Again");
							 }
							 else {
							 
							 System.out.println("Select the Option you want to Update\n1 : First Name\n2 : Last Name\n3 : Address\n"
							 		+ "4 : City\n5 : State\n6 : Zip\n7 : Phone Number\n8 : Email\nSelect :");
							 int choice = sc.nextInt();
							 
							 switch(choice) {
							 case 1 : System.out.println("Enter the new First Name to Update : ");
							 		  String newFirstName = sc.next();
							 		  contactUpdate.setFirstName(newFirstName);
							 		  break;
							 case 2 : System.out.println("Enter the new Last Name to Update : ");
					 		  		  String newLastName = sc.next();
					 		  		  contactUpdate.setLastName(newLastName);
					 		  		  break;
							 case 3 : System.out.println("Enter the new Address to Update : ");
					 		  		  sc.nextLine();
							 		  String newAddress = sc.nextLine();
					 		  		  contactUpdate.setAddress(newAddress);
					 		  		  break;
							 case 4 : System.out.println("Enter the new City to Update : ");
			 		  		  		  sc.nextLine();
					 		  		  String newCity = sc.nextLine();
					 		  		  contactUpdate.setCity(newCity);
					 		  		  break;
							 case 5 : System.out.println("Enter the new State to Update : ");
							 		  sc.nextLine();
							 		  String newState = sc.nextLine();
							 		  contactUpdate.setState(newState);
							 		  break;
							 case 6 : System.out.println("Enter the new Zip to Update : ");
					 		  		  Long newZip = sc.nextLong();
					 		  		  contactUpdate.setZipCode(newZip);
					 		  		  break;
							 case 7 : System.out.println("Enter the new Phone Number to Update : ");
					 		  		  Long newPhoneNo = sc.nextLong();
					 		  		  contactUpdate.setPhoneNo(newPhoneNo);
					 		  		  break;
							 case 8 : System.out.println("Enter the new Email to Update : ");
					 		  		  String newEmail = sc.next();
					 		  		  contactUpdate.setEmail(newEmail);
					 		  		  break;
					 		 default : System.out.println("Enter Valid Number"); 
							 }
							 }
							 break;
							 
					case 3 : // Console input to take First and Last Names to Remove Contact
						 	 System.out.println("Enter your First Name to Enable Removing your Contact : ");
						 	 String removeFirstName = sc.next();
						 	 System.out.println("Enter your Second Name to Enable Removing your Contact : ");
						 	 String removeLastName = sc.next();
						 	 boolean remove = addressBook.removeContact(removeFirstName, removeLastName);
						 	 if(remove)
						 		 System.out.println("Contact Sucessfully Removed");
						 	 else
						 		 System.out.println("Contant not Available. Please Try Again");
						 	 break;
						 	 							 							 
					case 4 : break;
				}
			}
			}
			else
				System.exit(0);
	}
	
	}		

}
