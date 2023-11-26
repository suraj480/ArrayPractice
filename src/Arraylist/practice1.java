package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class practice1 {
public static void main (String[]args) {

	ArrayList <String> cleancities = new ArrayList<>(20);
    cleancities.add("Indore");	
    cleancities.add("Surat");	
    cleancities.add("Ambikapur");	
    cleancities.add("Mysore");	
    cleancities.add("Vijayawada");	
    cleancities.add("Ahmedabad");	
    cleancities.add("Khargone");	
    cleancities.add("Rajkot");	
    cleancities.add("Tirupati");	
    cleancities.add("Jamshedpur");	
    cleancities.add("Bhopal");	
    cleancities.add("Gandhinagar");	
    cleancities.add("Chandigarh");	
    cleancities.add("Bilaspur");	
    cleancities.add("Nashik");
  //  cleancities.remove("Indore");
    
  // System.out.println(cleancities.contains("Patiala"));
   // cleancities.set(3,"Kochi");
   // System.out.println(cleancities);
  //  System.out.println("size :" + cleancities.size());
    // iterrator
    Iterator<String> it = cleancities.iterator();
    // prints only indore
  //  System.out.println(it.next());
    while (it.hasNext()) {
    	System.out.println(it.next());
    }
    
    
}
}