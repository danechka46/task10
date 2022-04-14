import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите расмерность матрицы");
        int n = s.nextInt();
        int m = s.nextInt();
        double[][] ar = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Введите ["+i+"]["+j+"] элемент: ");
                ar[i][j] = s.nextDouble();
            }
            System.out.println();
        }
        for(int i = 0; i < 1; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j] * 3 + " ");
            }
        }
    }
}
