package flowchart;

public class lmj {

	public static void main(String[] args) {

		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;

		A = 1;
		B = 3;
		C = 5;
		D = 7;

		if (B == 3) {
			A = 10;
		} else {
			C = 5;
		}

		if (D == 9) {
			B = 200;
		} else {
			B = 5;
		}
		if (A == 10) {
			C = 50;
		} else {
			D = 30;
		}

		System.out.println("A:" + A + ",B:" + B + ",C:" + C + ",D:" + D);

	}

}
