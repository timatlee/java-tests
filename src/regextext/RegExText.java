/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author tima
 */
public class RegExText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testRegEx("123 Elm Street", "[\\w\\s\\d]*");
        testRegEx("123 &Elm Street", "[\\w\\s\\d]*");
    }
    
    
    public static void testRegEx(String subject, String regexPattern) {
        Pattern r = Pattern.compile(regexPattern);
        Matcher m = r.matcher(subject);
        
        System.out.println("In string: " + subject);
        System.out.println("Finding pattern: " + r);
        
        System.out.println(m.matches());
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println();
    }
    
}
