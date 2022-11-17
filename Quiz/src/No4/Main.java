package No4;

import java.util.Scanner;

//숫자 야구 게임
//1. 0~9까지 정수 3개를 난수로 생성
//2. 사용자 3개의 숫자 입력
//3. 같은 위치에 있으면 Strike, 
//   숫자가 존재하지만 다른위치에 있으면 Ball
//ex) 3 6 8
//input) 6 7 8 -> 1 Strike, 1 Ball
//input) 1 2 4 -> out
//input) 3 6 8 -> 축하합니다. 게임 종료 

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("야구 숫자 게임 시작!");
		int Scount = 0;
		int Bcount = 0;

		int[] ArrNum = new int[3];
		int[] Usernum = new int[3];

		for (int i = 0; i < ArrNum.length; i++) {
			ArrNum[i] = (int) (Math.random() * 10);
			for(int j=0; j<i;j++)
			{
				if(ArrNum[i]==ArrNum[j]) 
				{
					i--;
					break;
				}
			}
		}

		do {
			System.out.println();
			/* 정답출력 확인 */
			System.out.print("정답: ");
			for (int a = 0; a < 3; a++) {
				System.out.print(ArrNum[a] + " ");
			}
			System.out.println();
			
			System.out.print("숫자 3개를 입력해주세요.> ");
			for (int i = 0; i < Usernum.length; i++) {
				Usernum[i] = sc.nextInt();
			}
	
			for (int i = 0; i < ArrNum.length; i++) {
				if (ArrNum[i] == Usernum[i]) {
					Scount++;
				} else if (ArrNum[0] == Usernum[i] || ArrNum[1] == Usernum[i] || ArrNum[2] == Usernum[i]) {
					Bcount++;
				}
			}
			System.out.printf("%d Strike! %d Ball\n", Scount, Bcount);
			
			if(Scount==0 && Bcount==0)
			{
				System.out.println("OUT!");
			}
			else if(Scount!=3)
			{
				Scount = 0;
				Bcount = 0;
			}
		} while(Scount<3);
		sc.close();
		System.out.println();
		System.out.println("축하합니다!");
		System.out.println("GAME OVER");
	}
}
