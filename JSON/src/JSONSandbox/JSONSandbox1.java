package JSONSandbox;
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;  
import java.io.IOException;
import java.util.Iterator;  
import org.json.simple.parser.ParseException; 


public class JSONSandbox1 {
	public static void main(String[] args) {  
		
		JSONObject byuObj = new JSONObject();  
        byuObj.put("Major", "CIT");  
        byuObj.put("Course", "Object Oriented Programing");  
// create an array of topics which will be added to JSON byuObj
        JSONArray listOfTopics = new JSONArray();  
        listOfTopics.add("1: Java Collections");  
        listOfTopics.add("2: Hibernate");  
        listOfTopics.add("3: JSON");  
        listOfTopics.add("4: HTTP"); 
        listOfTopics.add("5: Threads"); 
        listOfTopics.add("6: MVC"); 
        listOfTopics.add("7: Application Controller Pattern"); 
        listOfTopics.add("8: Use Case Diagram"); 
        listOfTopics.add("9: Use Case Document"); 
        listOfTopics.add("10: State Diagram"); 
        listOfTopics.add("11: Sequence Diagram"); 
// saves the array or topics I made as 'Topics' in JSON object 
        byuObj.put("Topics", listOfTopics);  
  
        try {  
              
            // Writing to a file  in my downloads folder
            File file=new File("E:\\Downloads\\CitJsonFile.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing File.................");  
  
            fileWriter.write(byuObj.toJSONString());  
  
            fileWriter.flush();  
            fileWriter.close();  
            
            System.out.println("File Written :)");
            System.out.println();
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        
        
        //READ The file we just made
        JSONParser parser = new JSONParser();
        System.out.println("Reading File.............");
  	  try {  
  	  
  	   Object obj = parser.parse(new FileReader("E:\\Downloads\\CitJsonFile.json"));  
  	  
  	   JSONObject jsonObject = (JSONObject) obj;  
  	  
  	   String major = (String) jsonObject.get("Major");  
  	   System.out.println("Major: "+major);  
  	  
  	   String course = (String) jsonObject.get("Course");  
  	   System.out.println("Course: "+course);  
  	  
  	   System.out.println("Topics are:");  
  	   
  	   JSONArray topics = (JSONArray) jsonObject.get("Topics");  
  	   Iterator<String> iterator = topics.iterator();  
  	   
  	   while (iterator.hasNext()) {  
  	    System.out.println(iterator.next());  
  	   }  
  	  
  	  } catch (FileNotFoundException e) {  
  	   e.printStackTrace();  
  	  } catch (IOException e) {  
  	   e.printStackTrace();  
  	  } catch (ParseException e) {  
  	   e.printStackTrace();  
  	  }  
  }
}
