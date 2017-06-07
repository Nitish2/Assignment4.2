package Pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k;
		char m;
		for (i = 1; i <= 5; i++) {
			m = 'a';
			for (j = 1, k=0; j <= 5; j++) {
				// increasing
				if (i < 4) {
					if (j >= 4 - i && j <= 2 + i) {
						System.out.print(m);
						if (j < 3) {
							m++;
						} else {
							m--;
						}
					} else {
						System.out.print(" ");
					}
				} else {
					
					// decreasing					
					if (j>i-3 && j <= 5-k) {
						
						System.out.print(m);
						if (j<3) {
							m++;
						} else {
							m--;
						}
					} else {
						System.out.print(" ");
						k++;
					}
				}

			}

			System.out.println();
		}
	}

}

