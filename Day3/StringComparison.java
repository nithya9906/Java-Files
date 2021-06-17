import java.util.Scanner;
public class StringComparison{
   public static void main(String args[]){
      Scanner in=new Scanner(System.in);
	  int l1,l2;
	  String str1,str2;
	  do{
		  System.out.println("Enter the first string:");
		  str1 = in.nextLine();
		  l1=str1.length();
		  System.out.println(l1);
		  System.out.println("Enter the second string as same size as first string:");
		  str2 = in.nextLine();
		  l2=str2.length();
		}while(l1<3 || l2<3);
	  System.out.println( "First word is "+findFirstWord(str1,str2));
   }
   public static String findFirstWord(String str1,String str2){
	    
	    if(str1.toLowerCase().charAt(0)<str2.toLowerCase().charAt(0))
		{
			return str1;
		}
		else
		{
			return str2;
		}
	}
  
}
