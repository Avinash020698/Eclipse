import java.io.*;
import java.util.*;	
public class Input {

	public static void main(String[] args) throws Exception {
		File inpt= new File("C:\\Users\\Avinash\\Desktop\\input.txt");
		ArrayList<String> list=new ArrayList<String>();
		String data;
        Scanner sc= new Scanner(inpt);
        while(sc.hasNext())
        {
           data=sc.nextLine();
           list.add(data);
        }
        int Size=list.size();
        for(int i=0;i<=Size;i++) {
        
        System.out.println(list.get(i));
        }
        
	}

}
