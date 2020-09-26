import java.util.Arrays;

public class ArrayMathUtils {

    public static void main(String[] args) {
        int [] div = calculaDivisores(32);
        printArraysInt(div);

        double [] numeros = {12.4, 43.1, 4.3, 54.0, 15};
        double maior = computaMaior(numeros);
        System.out.println("\nO maior número é: " + maior);

        double menor = computaMenor(numeros);
        System.out.println("\nO menor número é: " + menor);

        double media = computaMedia(numeros);
        System.out.println("\nA media é: " + media);

        double [] valores = {12.4, 43.1, 4.3, 54.0, 12.4};
        boolean repeticao = temNumRepetido(numeros);
        System.out.println("\n"+ repeticao + "\n");

        //Imprimindo uma matriz quadrada
        int [][] matriz1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] matriz2 = {{9,8,7}, {6,5,4}, {3,2,1}};

        int[][] result = somaMatrizes(matriz1, matriz2);

        printSquareMatrix(matriz1);
        printSquareMatrix(matriz2);
        printSquareMatrix(result);

        // Imprimindo uma matriz 3x2, recebendo como parâmetro linha e coluna
        int [][] matz1 = {{1,2}, {3,4}, {5,6}};
        int [][] matz2 = {{6,5}, {4,3}, {2,1}};

        int[][] resultado = somaQuaisquerMatrizes(matz1, matz2, 3, 2);
        printSquareMatrix2(resultado, 3,2);
    }

    public static int[] calculaDivisores(int num) {
        int cont = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                cont += 1;
            }
        }
        int [] divisores = new int[cont];
        cont = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                divisores[cont] = i;
                cont++;
            }
        }
        return divisores;
    }

    public static double computaMaior(double[] numeros) {
        double maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static double computaMenor(double[] numeros) {
        double menor = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static double computaMedia(double[] numeros) {
        int cont = 0;
        double soma = 0;
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            cont++;
        }
        return (soma/cont);
    }

    public static boolean temNumRepetido(double[] numeros) {
        boolean repetido = false;
        int cont = 0; 
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] == numeros[j] && i!=j) {
                    cont++;
                }
            } 
            if(cont > 0) {
                repetido = true;
            }
        }
        return repetido; 
    }

    public static int[][] somaQuaisquerMatrizes(int[][] m1, int[][] m2, int linha, int coluna) {
        int [][] resultado = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j]; 
            }
        }
        return resultado;
    }


    public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
        int[][] resultado = new int[m1.length][m1.length];

        for(int i = 0; i < m1.length; i++) {
            for(int j = 0; j < m1.length; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return resultado;
    }

    //Imprimindo uma matriz quadrada
    public static void printSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j < matrix.length) {
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");
                }
            }
            if (i < matrix.length-1) {
                System.out.println("");
            }
        }
        System.out.println("\n");
    }

    public static void printArraysInt(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length-1)
            {
                System.out.print(" ");
            }
        }

        System.out.print("]\n");
    }

    // Imprimindo uma matriz 3x2, recebendo como parâmetro linha e coluna
    public static void printSquareMatrix2(int[][] matrix, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (j < coluna) {
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");
                }
            }
            if (i < matrix.length-1) {
                System.out.println("");
            }
        }
        System.out.println("\n");
    }
}

