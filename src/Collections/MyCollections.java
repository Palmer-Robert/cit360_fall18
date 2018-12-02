
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.*;

/**
 * This is my sandbox code for practice.
 * 
 */
public class MyCollections {
    
    // Creation of array list
    private static void arrayList() {
        List<Integer> list1 = new ArrayList<>();
        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        
        System.out.println("******Inside list1******\n");
        System.out.println("list1: " + list1);
        
        list1.remove(3);
        System.out.println("list1: " + list1);
        
        list1.remove(3);
        System.out.println("list1: " + list1);// Method binding explains this
        
        list1.add(0, 10);// Adds 10 to the [0] place.
        System.out.println("list1: " + list1);
        
        list1.set(0, 9);// Sets 9 in the [0] place to replace the number 10
        System.out.println("list1: " + list1);
        System.out.println("**********End of ArrayList***********\n");
    }
    
    private static void dequeForMe() {
        System.out.println("*******Inside dequeForMe*********\n");
        
        // Showing first in first out (FIFO)
        Deque<String> smurfs = new ArrayDeque<>();
        smurfs.add("Papa Smurf");
        smurfs.add("Brainy Smurf");
        smurfs.add("Grouchy Smurf");
        smurfs.add("Hefty Smurf");
        smurfs.add("Vanity Smurf");
        smurfs.add("Smurfette");
        
        // This removes the objects based on the FIFO method
        System.out.println(smurfs);
        System.out.println("****FIFO****\n");
        System.out.println(smurfs.remove()); // First on the list is removed
        System.out.println(smurfs.remove()); // Second on the list is removed
        System.out.println(smurfs.remove());
        System.out.println(smurfs.remove());
        System.out.println(smurfs.remove());
        System.out.println(smurfs.remove());
        
        // Showing last in first out
        smurfs.push("Papa Smurf");
        smurfs.push("Brainy Smurf");
        smurfs.push("Grouchy Smurf");
        smurfs.push("Hefty Smurf");
        smurfs.push("Vanity Smurf");
        smurfs.push("Smurfette");
        
        System.out.println("\n");
        System.out.println("*****LIFO*****\n");
        System.out.println(smurfs.pop());
        System.out.println(smurfs.pop());
        System.out.println(smurfs.pop());
        System.out.println(smurfs.pop());
        System.out.println(smurfs.pop());
        System.out.println(smurfs.pop());
    }
    
    private static void hashMeUp() {
        HashSet<String> warrior = new HashSet<String>();
        
        // Warrior names being added using the add() method
        warrior.add("Ryu");
        warrior.add("Guile");
        warrior.add("Ken");
        warrior.add("Chun-Li");
        warrior.add("Vega");
        
        // This is simply to add space to separate from the methods
        System.out.println("\n");
        System.out.println("****Inside the HashSet****\n");
        
        // Displaying the HashSet
        System.out.println(warrior);
        System.out.println("Does the list contain Balrog? " +
                warrior.contains("Balrog") + "\n"); // Returns false
        
        // Removing an element from the list and showing the list after the element is removed
        warrior.remove("Vega");
        System.out.println("What's left on the list? " + warrior + "\n");
        
        // Iteration example
        System.out.println("Iterated list: ");
        Iterator<String> i = warrior.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println("\n");
        
    }
    
    private static void hashMapExample() {
        System.out.println("****Inside HashMap****\n");
        
        // 
        HashMap<String, Integer> entry = new HashMap<>();
        
        entry.put("Palmer", 1363);
        entry.put("Smith", 1123);
        entry.put("Williams", 2091);
        entry.put("Cheese", 1800);
        entry.put("Heard", 3232);
        
        if(entry.containsKey("Palmer")) {
            Integer stat = entry.get("Palmer");
            System.out.println("The value for Palmer is: " + stat + "\n");
        }
        
        for(String s : entry.keySet()) {
            System.out.println(s);
        }
        System.out.println("\n");
    }
    
    
    
    // Main method must be in the code
    public static void main(String[] args) {
        arrayList();
        dequeForMe();
        hashMeUp();
        hashMapExample();
    }
}
