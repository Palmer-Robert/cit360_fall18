
package jsonStuff;

import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

/**
 *
 * @author Robert Palmer
 */
public class JSONWriter {
    
    public static void main(String[] args) throws FileNotFoundException {
        // New JSON Object created
        JSONObject obj = new JSONObject();
        
        // Adding data to my newly formed JSON Object
        obj.put("fname", "Robert");
        obj.put("lname", "Palmer");
        obj.put("age", 39);
        obj.put("id", 1363);
        
        // Writing simple JSON to a file created here
        PrintWriter print = new PrintWriter("student.json");
        print.write(obj.toString());
        
        print.flush();
        print.close();
    }
}
