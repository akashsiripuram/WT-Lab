import java.io.*;
import javax.xml.parsers.*; 
import org.xml.sax.*;
import org.xml.sax.helpers.*; 
 
public class Nine { 
    public static void main(String[] args) { 
        try { 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter any xml file name: "); 
            String filename = br.readLine(); 
            File f = new File(filename); 
 
            if (f.exists()) { 
                try { 
                    SAXParserFactory db = SAXParserFactory.newInstance(); 
                    SAXParser builder = db.newSAXParser(); 
                    System.out.println("\nElements in the xml document are:"); 
 
                    DefaultHandler handler = new DefaultHandler() { 
                        @Override 
                        public void startElement(String uri, String localName, String qName, 
Attributes attributes) throws SAXException { 
                            System.out.println("\t" + qName); 
                        } 
                    }; 
 
                    builder.parse(f, handler); 
                    System.out.println("\n" + filename + " is a well-formed XML Document"); 
                } catch (Exception e) { 
                    System.out.println(e.getMessage()); 
                } 
            } else { 
                System.out.println("File not found"); 
            } 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        } 
    } 
}