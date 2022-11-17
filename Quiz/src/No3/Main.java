package No3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] n=new int[6];
		int e=0;
		for(int i=0; i<n.length;i++) 
		{
			n[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0;i<n.length;i++) 
		{
			for(int j=0;j<n.length; j++) 
			{
				if(n[i]>n[j]) 
				{
					e=n[i];
					n[i]=n[j];
					n[j]=e;
				}				
			}
		}
		for(int i=0; i<n.length;i++) 
		{
			System.out.print(n[i]+" ");
		}		
	}
}

/* 선생님 문제풀이 */

//public class Main {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int[] ar = new int[6];
//		boolean[] chk = new boolean[6]; 
//
//		for (int i = 0; i < ar.length; i++) 
//		{
//			ar[i] = scan.nextInt();
//		}
//		scan.close();
//
//		for (int i = 0; i < ar.length; i++) 
//		{
//			int max = 0;
//			for (int j = 0; j < ar.length; j++) 
//			{
//				if (max < ar[j] && chk[j] == false) 
//				{
//					max = ar[j];
//				}
//			}
//			for (int j = 0; j < ar.length; j++) 
//			{
//				if (max == ar[j])
//				{
//					chk[j] = true;
//				}
//			}
//			for(int j=0;j<ar.length;j++) {
//				System.out.printf("%5d ",ar[j]);
//			}
//			System.out.println();
//			for(int j=0;j<ar.length;j++) {
//				System.out.printf("%5b ",chk[j]);
//			}
//			System.out.print(" : MAX - " + max + "\n");
//		}
//	}
//}