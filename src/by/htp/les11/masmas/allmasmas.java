package by.htp.les11.masmas;

import java.util.Random;

public class allmasmas {

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
//чтобы в одной строке была ровно одна единица, и вывести на экран.     
	public static void task01(String[] args) {
		int[][] mas = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				mas[i][1] = 1;
				System.out.print(mas[i][j] + " ");

			}
			System.out.println(" ");
		}
	}

//2. Создать и вывести на экран матрицу 2 x 3,
//заполненную случайными числами из [0, 9]. 
	public static void task02(String[] args) {
		int[][] b = new int[2][3];
		Random rand = new Random();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				int c = rand.nextInt(10);
				if (c > 5) {
					b[i][j] = 9;
				}
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}

//3. Дана матрица. Вывести на экран первый и последний столбцы.
	public static void task03(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j = j + a[i].length - 1) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("");
		}
	}

//4. Дана матрица. Вывести на экран первую и последнюю строки.      
	public static void task04(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i = i + a.length - 1) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("");
		}
	}

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами     
	public static void task05(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i = i + 2) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

//6. Дана матрица. Вывести на экран все нечетные столбцы,
//у которых первый элемент больше последнего.       
	public static void task06(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3, 11, 12 }, { 4, 5, 6, 41, 51 }, { 7, 8, 9, 71, 81 }, { 4, 7, 2, 9, 6 },
				{ 2, 8, 5, 3, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j = j + 2) {
				if (a[0][j] > a[a[i].length - 1][j])
					System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

//7. Дан двухмерный массив 5?5. 
//Найти сумму модулей отрицательных нечетных элементов.        
	public static void task07(String[] args) {
		int[][] a = new int[][] { { 1, -2, 3, 11, -12 }, { 4, -5, 6, 41, 51 }, { 7, -8, 9, 71, 81 },
				{ 4, -7, 2, -9, 6 }, { 2, 8, -5, 3, 9 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j = j + 2) {
				if (a[i][j] < 0) {
					sum = sum + Math.abs(a[i][j]);
				}
			}
		}
		System.out.println(sum + "");
	}

// 8. Дан двухмерный массив n?m элементов.
//Определить, сколько раз встречается число 7 среди элементов массива.         
	public static void task08(String[] args) {
		int[][] a = new int[][] { { 1, -2, 3, 11, -12 }, { 4, -5, 6, 41, 51 }, { 7, -8, 9, 7, 81 }, { 4, 7, 2, -9, 6 },
				{ 2, 8, -5, 3, 9 } };
		int l = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 7) {
					l++;
				}
			}

		}
		System.out.println(l + "");
	}

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.          
	public static void task09(String[] args) {
		int[][] a = new int[][] { { 1, -2, 3, 11, -12 }, { 4, -5, 6, 41, 51 }, { 7, -8, 9, 7, 81 }, { 4, 7, 2, -9, 6 },
				{ 2, 8, -5, 3, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j || (a.length - 1 - i) == j) {
					System.out.printf("%4d", a[i][j]);
				} else {
					a[i][j] = 0;// для наглядности
					System.out.printf("%4d", a[i][j]);// для наглядности
				}
			}
			System.out.println("");
		}
	}

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.          
	public static void task10(String[] args) {
		int k = 4;// определяет номер строки
		int m = 1;// определяет номер столбца
		int[][] a = new int[][] { { 1, -2, 3, 11, -12 }, { 4, -5, 6, 41, 51 }, { 7, -8, 9, 7, 81 }, { 4, 7, 2, -9, 6 },
				{ 2, 8, -5, 3, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == k || m == j) {
					System.out.printf("%4d", a[i][j]);
				} else {
					a[i][j] = 0;// для наглядности
					System.out.printf("%4d", a[i][j]);// для наглядности
				}
			}
			System.out.println("");
		}
	}

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//строка слева направо, третья строка справа налево и так далее.		       
	public static void task11(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 } };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			} else {
				for (int j = a[i].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}

//12. Получить квадратную матрицу порядка n:
	public static void task12(String[] args) {
		int n = 8;
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					a[i][j] += i;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

//13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void task13(String[] args) {
		int n = 10;
		int[][] b = new int[n][n];
		for (int i = 0; i < b.length; i++) {

			if (n % 2 == 0 & i % 2 == 0) {
				for (int j = 0; j < b[i].length; j++) {
					b[i][j] = b[i][j] + j + 1;
					System.out.print(b[i][j] + " ");
				}
			} else if (n % 2 == 0 & i % 2 != 0) {
				for (int j = b[i].length - 1; j >= 0; j--) {
					b[i][j] = b[i][j] + j + 1;
					System.out.print(b[i][j] + " ");
				}
			} else {
				System.out.println("Число n должно бать четным! Попробуйте еще раз.");
				break;
			}
			System.out.println("");
		}
	}

//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void task14(String[] args) {
		int n = 10;
		int[][] b = new int[n][n];
		if (n % 2 != 0) {
			System.out.println("Число n должно бать четным! Попробуйте еще раз.");
			return;
		}
		for (int i = b.length - 1; i >= 0; i--) {
			for (int j = b[i].length - 1; j >= 0; j--) {

				if (n % 2 == 0 & b.length - i - 1 == j) {
					b[i][j] = j - b[i][j] + 1;
					System.out.printf("%3d", b[i][j]);
				}

				else {
					System.out.printf("%3d", b[i][j]);
				}
			}
			System.out.println(" ");

		}
	}

//15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void task15(String[] args) {
		int n = 8;
		int[][] b = new int[n][n];
		if (n % 2 != 0) {
			System.out.println("Число n должно бать четным! Попробуйте еще раз.");
			return;
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = b[i].length - 1; j >= 0; j--) {

				if (n % 2 == 0 & b.length - i - 1 == j) {
					b[i][j] = j - b[i][j] + 1;
					System.out.printf("%3d", b[i][j]);
				}

				else {
					System.out.printf("%3d", b[i][j]);
				}
			}
			System.out.println(" ");

		}
	}

//16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void task16(String[] args) {
		int n = 8;
		int[][] b = new int[n][n];
		if (n % 2 != 0) {
			System.out.println("Число n должно бать четным! Попробуйте еще раз.");
			return;
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {

				if (n % 2 == 0 & i == j) {
					b[i][j] = b[i][j] + j + 1;
					System.out.print(b[i][j] + "*" + (b[i][j] + 1) + " ");
				}

				else {
					System.out.print(b[i][j] + " ");
				}
			}
			System.out.println(" ");

		}
	}

//17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):	
	public static void task17(String[] args) {
		int n = 8;
		int[][] b = new int[n][n];
		if (n % 2 != 0) {
			System.out.println("Число n должно бать четным! Попробуйте еще раз.");
			return;
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {

				if (n % 2 == 0 & (i == 0 || j == 0 || i == (n - 1) || j == (n - 1))) {
					b[i][j] = 1;
					System.out.print(b[i][j] + " ");
				}

				else {
					System.out.print(b[i][j] + " ");
				}
			}
			System.out.println(" ");

		}
	}
}
