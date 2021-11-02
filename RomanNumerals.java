import java.util.*;
public class RomanNumerals {
	public static void main (String [] agrs)
	{
		Scanner console = new Scanner(System.in);
		String [] str = {"Hello", "Goodbye", "Computer" , "Science", "Um", "Do", "What", "Now"};
		
		//3
		System.out.println(str[0].charAt(0) + " " + str[1].charAt(0) + " " + str[2].charAt(0) + " " + str[3].charAt(0) + " " + str[4].charAt(0) + " " + str[5].charAt(0) + " " +str[6].charAt(0) + " " +str[7].charAt(0) );
		
		//4
		int count = 0;
		for(int i =0; i<str.length; i++)
		{
			int length = str[i].length();
			char letter = str[i].charAt(length-1);
			String compare = Character.toString(letter);
			if(compare.contentEquals("e"))
			{
				count ++;
			}
		}
		System.out.println(count);
		
		//5
		int totalLength = 0;
		for(int i = 0;i<str.length; i++)
		{
			int length = str[i].length();
			totalLength = totalLength + length;
		}
		System.out.println(totalLength);
		
		//8 
		int eCount = 0;
		int i =0 ;
		while(i<str.length)
		{
			for(int j =0; j< str[i].length(); j++)
			{
				char letter = str[i].charAt(j);
				String compare = Character.toString(letter);
				if(compare.contentEquals("e"))
				{
					eCount ++;
					j+= str[i].length()-1;
					
				}
				
			}
			i++;
		}
		System.out.println(eCount);
		
		//10
		int num = 0;
		for(int j = 0; j<str.length; j++)
		{
			int length = str[j].length();
			if(length >= 7)
			{
				num++;
			}
			
			
		}
		if(num>=2)
		{
			System.out.println("Two len. 7!");
		}
		else
		{
			System.out.println("Less than 2 len. 7");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Please enter a phrase");
		String text = console.next();
		int vCount = 0;
		for(int r = 0; r < text.length(); r++)
		{
			String comp = text.substring(r, r+1);
			
			if(comp.equalsIgnoreCase("a") || comp.equalsIgnoreCase("e")||comp.equalsIgnoreCase("i")||comp.equalsIgnoreCase("o")||comp.equalsIgnoreCase("u"))
			{
				vCount++;
			}
		}
		System.out.println(vCount);
	} 
	
	

}
