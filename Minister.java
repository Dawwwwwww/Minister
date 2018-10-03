import java.util.*;

public class Minister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String minis[][] = new String[6][3];
		int score[][] = new int[6][3];
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j == 1) {
					System.out.print("Input Prime Minister ID = ");
					minis[i][j] = sc.nextLine();
				}
				if (j == 2) {
					System.out.print("Input Prime Minister Name = ");
					minis[i][j] = sc.nextLine();
				}

			}
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j == 1) {
					System.out.print("Id = " + minis[i][j] + " ");
				}
				if (j == 2) {
					System.out.print("Name = " + minis[i][j] + " ");
					System.out.println();
				}

			}

		}
		score(score, minis);
		findWinner(score, minis);

	}

	public static void score(int score[][], String minis[][]) {
		Scanner scan = new Scanner(System.in);
		int vote;
		for (int i = 1; i <= 5; i++) {
			score[i][1] = Integer.parseInt(minis[i][1]);
		}
		for (int i = 1; i <= 200; i++) {
			System.out.print("Vote id =  ");
			vote = scan.nextInt();
			if (vote == score[1][1]) {
				score[1][2] += 1;
			}
			if (vote == score[2][1]) {
				score[2][2] += 1;
			}
			if (vote == score[3][1]) {
				score[3][2] += 1;
			}
			if (vote == score[4][1]) {
				score[4][2] += 1;
			}
			if (vote == score[5][1]) {
				score[5][2] += 1;
			}
		}

	}

	public static void findWinner(int score[][], String minis[][]) {

		int max = score[1][2];
		int id = score[1][1];
		String name = null;
		for (int i = 1; i <= 5; i++) {
			if (score[i][2] > max) {
				max = score[i][2];
				id = score[i][1];
			}
		}
		for (int i = 1; i <= 5; i++) {
			String idTemp = String.valueOf(id);
			if (idTemp.equals(minis[i][1])) {
				name = minis[i][2];
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Winner is " + name);
		System.out.println("Id = " + id);
		System.out.println("Score = " + max + " point");

	}

}
