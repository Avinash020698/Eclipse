import java.io.*;
import java.util.*;
public class CSV_Birthdays {

	public static void main(String[] args) {
		try {
		PrintWriter pw=new PrintWriter(new File("E:\\Birthdays001.csv"));
		StringBuilder sb= new StringBuilder();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		    {
			      System.out.println("Enter the name: ");
			      String s1=sc.nextLine();
			      sb.append(s1);
			      sb.append(",");
			      System.out.println("Enter the Message: ");
			      String s2=sc.nextLine();
			      sb.append(s2);
			      sb.append("\r\n");
		    }
		              pw.write(sb.toString());
	                  pw.close();
	      
	                  System.out.println("Finished");
		
		}
		
		catch(Exception e) {
			
		}
	}

}
