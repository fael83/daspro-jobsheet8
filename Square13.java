import java.util.Scanner;
public class Square13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int N = sc.nextInt();
        for (int iOuter = 0; iOuter <= N; iOuter++){
            for (int i = 0; i <= N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
