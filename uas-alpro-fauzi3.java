public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				int n = 5;
				int i, j;
				for (i = 0; i <= n ; i++) {
				for (i = 0; i < n ; i++) {
					for (j = n; j > i; j--) {
						System.out.print(" ");
					}
					for (j = 0; j <= i; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
			}
		}
	}
