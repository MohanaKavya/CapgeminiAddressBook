package com.capgemini.assignments.controller;

import java.util.Scanner;
import com.capgemini.assignments.model.*;

public class AddressBookMain {

	public static void main(String[] args) {
			
			// Display Welcome Message
			System.out.println("Welcome to Address Book Program");
			
			Scanner sc = new Scanner(System.in);
			
			// Instantiation of AddressBook Class
			AddressBook addressBook = new AddressBook();
			
			while(true) {
				
				System.out.println("Menu \n1 : Add Contact to Address Book\n2 : Exit\nEnter your Choice :");
				int option = sc.nextInt();
				
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
			
							 // Instantiation of Contact Class
							 Contact contact = new Contact(first_name, last_name, address, city, state, zip_code, phone_no, email);
							
							 // Add New Contact into Address Book
							 addressBook.addContactToAddressBook(contact);
							 break;
							 
					case 2 : System.exit(0);
				}
			}
	}

}
