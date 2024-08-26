import java.util.Scanner;

public class Array {
     public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] list1 = getArray();
        System.out.print("Enter list2: ");
        int[][] list2 = getArray();
        System.out.println("The two arrays are" + 
			(equals(list1, list2) ? " " : " not ") + "identical");
    }
     public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
    }
    
    public static int[][] getArray() {
		@SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
		int[][] y = new int[3][3];
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = input.nextInt();
			}
		}
		return y;
    }
}
