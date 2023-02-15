package matriz_mostrar_valores_diaginais;

import java.util.Locale;
import java.util.Scanner;

public class matriz_mostrar_valores_diaginais {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// valor inserido pelo usuario para definir o tamanho da matriz e os valores adicionados
		int N = sc.nextInt();

		// define que a matriz terá o tamanho especificado pela variavel 'N'
		int[][] mat = new int[N][N];

		// adiciona os valores inseridos na matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("DIAGONAL PRINCIPAL:");

		// percorre a matriz e mostra os valores armazenados na diagonal
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		
		// percorre a matriz e conta quantos numeros armazenados são negativos e printa na tela
		int cont = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					cont = cont + 1;
				}
			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		sc.close();

	}

}
