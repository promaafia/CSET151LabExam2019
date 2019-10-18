import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {
	public static void main(String[] args) 
	{

//		Check arguments
		if(args[0].equals("a")) {
		if(args[0].equals("a")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String r = s.readLine();
			String i[] = r.split(",");			
			for(String j : i) { System.out.println(j); }
			} catch (Exception e){} 
			for(String j : i) { System.out.println(j);
                               }
			            } 
                 catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try {
			try 
			{
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
							new FileInputStream("students.txt")));  
			String r = s.readLine();

			String i[] = r.split(",");	
			Random x = new Random();
				int y = x.nextInt(i.length);
					System.out.println(i[y]);
			} catch (Exception e){} 
			} 
			catch (Exception e){} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");			
			try {
			try
			 {
			BufferedWriter s = new BufferedWriter(
					new FileWriter("students.txt", true));
			String t = args[0].substring(1);
@@ -60,7 +67,8 @@ else if(args[0].contains("?"))
			String i[] = r.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
			for(int idx = 0; idx<i.length && !done; idx++)
			 {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
@@ -83,7 +91,8 @@ else if(args[0].contains("c"))
			for(char c:a) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;	}
					if (!in_word) {	count++; in_word =true;
	}
					else { in_word=false;}			
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}