package ArrayTest;

import java.util.ArrayList;
import java.util.List;

public class StringArrayLength {
public static void main(String[] args) {
	String Name = "MusM";
	int length = Name.length();
	System.out.println(length);
	char[]split = Name.toCharArray();
	System.out.println(split);
	int count;
	List memory = new ArrayList();
	for(int i=0;i<length;i++)
	{
		count=1;
		for(int j=i+1;j<length;j++)
		{
			if(split[i] == split[j])
			{
			count++;
			}
		}
		if(memory.indexOf(split[i]) == -1){
		System.out.println(split[i]+ ": " + count);
		}
		memory.add(split[i]);
	}
}
}
