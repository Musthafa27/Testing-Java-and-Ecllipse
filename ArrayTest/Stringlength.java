package ArrayTest;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Stringlength {
public static void main(String[] args) {
	String Name = "MusthafaMuz";
	char[] inp = Name.toCharArray();
	int name_len = Name.length();
	List memory = new ArrayList();
	//char c [] = {'M','u','s','t','h','a','f','a'};
	int count;
	for(int i=0;i<name_len ;i++)
	{
		count=1;
		for(int j=i+1;j<name_len;j++)
		{
			if(inp[i] == inp[j])
			{
				count++;
			}				
		}
		if(memory.indexOf(inp[i]) == -1){
			System.out.println("" + inp[i] + ": " + count);
		}
		memory.add(inp[i]);
	}
}
}

