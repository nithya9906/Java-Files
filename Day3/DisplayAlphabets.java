import java.util.*;
public class DisplayAlphabets 
{  
	public static void main(String args[])  
	{  
		char[] arr=new char[26];
		arr=getAlphabetArray();             
		for (int i = 0; i < arr.length; i++)   
		System.out.print( arr[i]+ " ");     
	}
	public static char[] getAlphabetArray()  
	{  
		char[] alpa= new char[26];  
		char c='A';
		int i=0;
		do
		{
			alpa[i]=c;
			i++;
			c++;
		}
		while(c<='Z');
		return alpa;
	}
	 
}  