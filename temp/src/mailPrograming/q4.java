package mailPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {

		/*
		 * 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나
		 * 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다. 예제) Input: 12345 Output: False
		 * Input: -101 Output: False Input: 11111 Output: True Input: 12421
		 * Output: True
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Input: "+num);

		// int num = 1234567;

		int p = num;
		int r = 0;

		while (p != 0) {
			p = p / 10;
			r++;

		}
		// System.out.println(r);
		int[] array = new int[r];
		for (int i = r - 1; i >= 0; i--) {
			int t = 1;
			for (int j = i; j > 0; j--) {
				t = t * 10;
			}
			array[i] = num / t % 10;
		}

		//System.out.println(Arrays.toString(array));
		
		// int a = num / 10000 % 10;
		// int b = num / 1000 % 10;
		// int c = num / 100 % 10;
		// int d = num / 10 % 10;
		// int e = num / 1 % 10;

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// System.out.println(d);
		// System.out.println(e);
		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[array.length - i - 1]) {
				flag = true;

			} else {
				flag = false;
				break;
			}
		}
		System.out.println("Output: "+flag);
	}

}
