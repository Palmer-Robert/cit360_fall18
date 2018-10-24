/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.net.*;
import java.io.*;

/**
 *
 * @author palmerfam
 */
public class URLReader {
    public static void main(String[] args) throws Exception {
        
        URL nfl = new URL("http://www.nfl.com/schedules");
        BufferedReader in = new BufferedReader(new InputStreamReader(nfl.openStream()));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
