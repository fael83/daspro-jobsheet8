import java.util.Scanner;
public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int N = sc.nextInt();
        int i;
        for (i=0;i<N;i++){
            for (int a=0;a<N;a++){
                if (i == 0 || i == N - 1 || a == 0 || a == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}