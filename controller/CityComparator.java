package com.capgemini.assignments.controller;

import java.util.Comparator;

import com.capgemini.assignments.model.Contact;

public class CityComparator implements Comparator<Contact>{
		public int compare(Contact c1, Contact c2){  
			return c1.getCity().compareTo(c2.getCity()); 
	}
}

