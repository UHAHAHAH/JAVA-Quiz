package No5;

import java.util.Scanner;

/* 빙고게임 (수정중) */

public class Main {
	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0, count=0,cp1=0,cp2=0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			if(count%2==0)
			{
				System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)\n", SIZE * SIZE);
				System.out.print("player1 > ");
			}	
			else
			{
				System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)\n", SIZE * SIZE);
				System.out.print("player2 > ");
			}
			count++;
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						if(count%2==0)
						{
							bingo[i][j] = 0;
							cp2++;
						}
						else if(count%2!=0)
						{
							bingo[i][j] = -1;
							cp1++;
						}
						if(j==SIZE-1&& cp2<5 &&(bingo[i][j]==0 || bingo[j][i]==0))
						{
							cp2=0;
						}
						else if(j==SIZE-1&& cp2<5 &&(bingo[i][j]==-1 || bingo[j][i]==-1))
						{
							cp1=0;
						}
						break outer;
					}
				}
			}
			for(int i=0;i<SIZE;i++)
			{
				for(int j=0;j<SIZE;j++)
				{
					if((bingo[i][j]==-1 || bingo[j][i]==-1) && cp1==5)
					{
						System.out.println("player1 WIN!");
						num=0;
					}
					else if((bingo[i][j]==0 || bingo[j][i]==0) && cp2==5)
					{
						System.out.println("player2 WIN!");
						num=0;
					}
				}
			}
			
		} while (num != 0);
	}
}