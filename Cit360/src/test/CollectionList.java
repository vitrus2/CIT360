package test;
import java.util.*;

public class CollectionList {
	    public static void main(String[] a){
	         
	        ArrayList<String> pokemon = new ArrayList<String>();
	        //add elements to the List
	        pokemon.add("Pikachu");
	        pokemon.add("Squirtle");
	        pokemon.add("Charmander");
	        pokemon.add("Bulbasaur");
	        System.out.println("<<<<<List>>>>>");
	        System.out.println(pokemon);
	        //get elements by index
	        System.out.println("Does list contains Squirtle? "+pokemon.contains("Squirtle"));
	        System.out.println("Element at index 1: "+pokemon.get(1));
	        //add elements at a specific index
	        pokemon.add(2,"Pidgy");
	        System.out.println(pokemon);
	        System.out.println("Is arraylist empty? "+pokemon.isEmpty());
	        System.out.println("Index of Bulbasaur is "+pokemon.indexOf("Bulbasaur"));
	        System.out.println("Size of the arraylist is: "+ pokemon.size());
	        System.out.println();
	        CollectionMap();
	        System.out.println();
	        CollectionTreeMap();
	        System.out.println();
	        CollectionSet();
	        
	        
	    }
	    public static void CollectionMap() {
	    	HashMap<String, String> account = new HashMap<String, String>();
	        //add key-value pair to hashMap
	        account.put("amazon", "BradenA1");
	        account.put("ebay", "BradenE2");
	        account.put("facebook","BradenF3");
	        account.put("hotmail","BradenH4");
	        System.out.println("<<<<<Map>>>>>");
	        System.out.println(account);
	        //getting value for the given key from hashMap or getting password for website
	        System.out.println("Password for ebay: "+account.get("ebay"));
	        System.out.println("is my account information empty? "+account.isEmpty());
	        account.remove("facebook");
	        System.out.println(account);
	        System.out.println("Number of accounts: "+account.size());
	        return;
	    }
	    /*
	     * unlike a hash map, a tree map guarantees that its elements will be sorted in an ascending key order.
	     */
	    public static void CollectionTreeMap() {
	    	TreeMap<String, String> account = new TreeMap<String, String>();
	        //add key-value pair to TreeMap
	        account.put("amazon", "BradenA1");
		    account.put("ebay", "BradenE2");
		    account.put("facebook","BradenF3");
		    account.put("hotmail","BradenH4");
	        System.out.println("<<<<TreeMap>>>>");
	        System.out.println(account);
	        //getting value for the given key from TreeMap
	        System.out.println("Password for ebay: "+account.get("ebay"));
	        System.out.println("is my account information empty? "+account.isEmpty());
	        account.remove("ebay");
	        System.out.println(account);
	        System.out.println("Number of accounts: "+account.size());
	        return;
	    }
	    /*
	     * Items in a set have no ordering
	     * The only thing you can do with a set is add items to it and check if an
	     * item exists within the set.
	     * Sets are really limited and with unique members. On the other hand, they're really fast.
	     */
	    public static void CollectionSet() {
	    	HashSet<String> account = new HashSet<String>();
	        //add elements to HashSet
	        account.add("amazon");
	        account.add("ebay");
	        account.add("facebook");
	        account.add("hotmail");
	        System.out.println("<<<<HashSet>>>>");
	        System.out.println(account);
	        System.out.println("Is HashSet empty? "+account.isEmpty());
	        System.out.println("Number of accounts: "+account.size());
	        account.remove("ebay");
	        System.out.println("Number of accounts: "+account.size());
	        System.out.println("Does ebay exist? "+account.contains("ebay"));
	        System.out.println(account);
	    	return;
	    }
	}
