
	package matrix;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Moriin too: ");
				int row = sc.nextInt();

				System.out.print("Baganiin too: ");
				int col = sc.nextInt();

				int[][] a = new int[row][col];
				int[][] b = new int[row][col];

				System.out.println("1-r matrix:");

				for(int i=0;i<row;i++){
				    for(int j=0;j<col;j++){
				        a[i][j] = sc.nextInt();
				    }
				}

				System.out.println("2-r matrix:");

				for(int i=0;i<row;i++){
				    for(int j=0;j<col;j++){
				        b[i][j] = sc.nextInt();
				    }
				}

				System.out.print("Temdeg oruul (+ - *): ");
				String t = sc.next();

				matrix m = new matrix(a,b,t);

				m.choosehuvisagch();
			}
	    }
	}
