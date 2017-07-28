package com.gtm.TestsCollections.presentation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al = new ArrayList();
		al.add(12);
		al.add("une chaine de caratère");
		al.add(12.2f);
		al.add("d");
		al.add(12);
		
		for (int i=0; i<al.size(); i++)   //al.size permet de renseigner la taille de la liste
		{  
			System.out.println("la donnée à l'indice " + i + " est " +al.get(i));
		}
		
		System.out.println("-----------------------------------");
		
		
		List<String> al2 = new ArrayList<String>();
		al2.add("une chaine de caratère");
		al2.add("d");
		al2.add("d");
		
		for (int i=0; i<al2.size(); i++)
		{
			System.out.println("la donnée à l'indice " + i + " est " +al2.get(i));
		}

		System.out.println("-----------------------------------");
		
		Set s = new HashSet();
				
		s.add(12);
		s.add("d");
		s.add(12);
		
		//for (int i=0; i<s.size(); i++)
		//{
			//System.out.println("la donnée à l'indice " + i + " est " +s.get(i)); //marche pas avec le Set--> iterator ou toArray
		//}
		//
		//Test avec toArray()[]
//		for (int i=0; i<s.size(); i++)
//		{
//			System.out.println("la donnée à l'indice " + i + " est " +s.toArray()[i]);
//		}
	
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------------------------------");
		
		
		Set<Integer> s2 = new HashSet<Integer>();
	
		s2.add(12);
		s2.add(12);
		s2.add(123);
		
		Iterator it2 = s2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		System.out.println("-----------------------------------");
		
		
		//Map m = new Hashtable();
		Hashtable h = new Hashtable();
		
		h.put(1, "primtemps");
		h.put(10, "été");
		h.put("x", "automne");
		h.put(45, "hiver");
		
		Enumeration e = h.elements();
		Enumeration k = h.keys();
		
		while (e.hasMoreElements()) {
			//System.out.println(e.nextElement()); sysout pour Enumeration e (retour valeur)
			System.out.println("Clé: " + k.nextElement() + " => Valeur: " + e.nextElement()); //sysout pour Enumeration e (retour valeurs et pour enumeration k (retour clé)
		}
		
		System.out.println("-----------------------------------"); 
			
		// exercice suivant valeur=String et clé=integer	
		Hashtable<Integer, String> h2 = new Hashtable<Integer,String>();
			
		h2.put(1, "primtemps");
		h2.put(10, "été");
		h2.put(15, "automne");
		h2.put(45, "hiver");
			
		e = h2.elements();
		k = h2.keys();
			
		while (e.hasMoreElements()) {
				//System.out.println(e.nextElement()); sysout pour Enumeration e (retour valeur)
			System.out.println("Clé: " + k.nextElement() + " => Valeur: " + e.nextElement());
			
		}
	}
		
}
