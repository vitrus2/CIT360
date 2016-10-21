package test;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class URLConnector {
	
	public static void main(String[] args) throws Exception {
// Request web address
		System.out.println("Enter a website address (formatted: http://www.example.com/)");
// Get website from user
		Scanner scaner = new Scanner(System.in);
		String website = scaner.nextLine();
		scaner.close();
// Open URL connection
        URL example = new URL(website);
        URLConnection connection = example.openConnection();
        BufferedReader stream = new BufferedReader(new InputStreamReader(
                                    connection.getInputStream()));
// display html text
        String inputLine;
        while ((inputLine = stream.readLine()) != null) 
            System.out.println(inputLine);
        stream.close();
    }
}
