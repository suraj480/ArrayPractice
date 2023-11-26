package HashMap;

import java.util.HashMap;

public class practice4 {
public static void main (String []args) {
	
	 HashMap<String, String> Phonebook = new HashMap <String , String>  ();
	 Phonebook.put("Suraj" ,"8725836915");
	 Phonebook.put("ritul" ,"7205338284");
	 Phonebook.put("poorna" , "7873540718");
	
	//System.out.println(Phonebook);
	//System.out.println(Phonebook.get("poorna"));
	 System.out.println(Phonebook.replace("poorna","6239726448"));
	 System.out.println(Phonebook);
	 
	 
}
	
}
