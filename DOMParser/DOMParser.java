
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;



public class DOMParser {
    public static void main(String[] args) {
        try {
            System.out.println("Enter file name:");
            BufferedReader file=new BufferedReader(new InputStreamReader(System.in));
            String fileName=file.readLine();
            File fp=new File(fileName);
            if(fp.exists()){
                try{
                    DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder=dbFactory.newDocumentBuilder();
                    Document doc=builder.parse(fp);

                    System.out.println(fileName+" is well formed");

                    NodeList elements=doc.getElementsByTagName("*");
                    for(int i=0;i<elements.getLength();i++){
                        Element element=(Element)elements.item(i);
                        System.out.println("\t"+element.getNodeName());

                    }
                }
                catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
            else{
                System.out.println("File not found");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
