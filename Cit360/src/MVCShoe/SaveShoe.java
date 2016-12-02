package MVCShoe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.json.simple.JSONObject;

public class SaveShoe {
	public void saveFile(JSONObject shoes) {
	JSONObject jShoe = new JSONObject();
	jShoe.put("Shoes", shoes);
	try {  
        
        // Writing to a file  in my downloads folder
        File file=new File("E:\\Downloads\\JsonShoeFile.json");  
        file.createNewFile();  
        FileWriter fileWriter = new FileWriter(file);  
        System.out.println("Writing File.................");  

        fileWriter.write(jShoe.toJSONString());  

        fileWriter.flush();  
        fileWriter.close();  
        
        System.out.println("File Written :)");
        System.out.println();

    } catch (IOException e) {  
        e.printStackTrace();  
    }
}
	public void saveDb(Shoe shoe) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(shoe);
		session.getTransaction().commit();
		
	}
}
