import java.util.*;
public class SquareArray{
	static float[] square(int a,int b,int c,int d)
		{
			int i;
			float squareArr[]=new float[4];
			int arr[]={a,b,c,d};
			for(i=0;i<4;i++)
			{
				squareArr[i]=(float)(arr[i]*arr[i]);
			}
			return squareArr;
		}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int i;
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		int num4=in.nextInt();
		//float arr[]=new float[4];
		float[] arr=square(num1,num2,num3,num4);
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}