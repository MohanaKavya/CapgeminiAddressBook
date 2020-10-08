package com.capgemini.assignments.controller;

import java.util.Comparator;

import com.capgemini.assignments.model.Contact;

public class ZipComparator implements Comparator<Contact> {
	public int compare(Contact c1, Contact c2){  
		if(c1.getZipCode()==c2.getZipCode())  
		return 0;  
		else if(c1.getZipCode()>c2.getZipCode())  
		return 1;  
		else  
		return -1;  
		}
}
