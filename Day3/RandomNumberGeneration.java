import java.lang.Math.*;
public class RandomNumberGeneration{
       public static void main(String args[]){
             System.out.println("Random number generated is : "+randomNumbers());
       }
       public static int randomNumbers(){
           int random = (int)(Math.random() * 50 + 1);
		   return random;
       }
}