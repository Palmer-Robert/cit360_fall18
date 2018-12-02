
package jsonStuff;

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
/**
 *
 * @author palmerfam
 */
public class JSONReader {
    public static void main(String[] args) throws Exception {
        
        // Parsing from my student.json file
        Object read = new JSONParser().parse(new FileReader("student.json"));
        
        // Typecasting 
        JSONObject obj = (JSONObject) read;
        
        // Getting data from JSON file
        String firstname = (String) obj.get("fname");
        String lastname = (String) obj.get("lname");
        
        System.out.println(firstname); 
        System.out.println(lastname); 
    }
    
    
}
