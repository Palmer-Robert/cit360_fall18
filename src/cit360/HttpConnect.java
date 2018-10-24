/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Robert Palmer
 * Date started: 10/17/18
 * 
 */

// The class name tells what class is supposed to do.
public class HttpConnect {
    // The main() must be in the code because it's needed to start the code.
    // In order for the code to compile correctly , it has to throw an exception.
    public static void main(String args[]) throws Exception {
        // Step 1: Create a URL object
        URL url = new URL("http://google.com");
        
        // Step 2: Obtain a connect object from the URL
        URLConnection urlCon = url.openConnection();
        // HttpURLConnection http = (HttpURLConnection) url.openConnection();
        
        // Step 3: Configure the URLConnection
        
    }
}
