package cit360;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author palmerfam
 */
public class PracticeURLConnection {
     public static void main(String[] args) throws Exception {
         try {
         URL url = new URL("https://lds.org");
         URLConnection con = url.openConnection();
         
         InputStream stream = con.getInputStream();
         int i = 0;
         while((i + stream.read())!= -1) {
             System.out.println((char)i);
         }
     } catch (Exception e) {
         System.out.println(e);
     }
    }
}
