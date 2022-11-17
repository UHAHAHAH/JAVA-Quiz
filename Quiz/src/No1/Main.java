package No1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double[] n = new double[5];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextDouble();
			sum += n[i];
		}
		sc.close();

		System.out.printf("SUM : %.1f\n", sum);
		System.out.printf("AVG : %.1f\n", sum / n.length);
	}
}
