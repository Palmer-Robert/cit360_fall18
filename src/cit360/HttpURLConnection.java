/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Robert Palmer
 */
// This class is focused on HttpURLConnections
public class HttpURLConnection {
    public static void main(String[] args) throws Exception {
    URL url = new URL("http://www.google.com");
    URLConnection connect = url.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
    String inputLine;
    while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
    in.close();
    
    }
}
