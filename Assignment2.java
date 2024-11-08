import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PORSENI 2024 Athlete Registration");

        for (int i = 1; i <= 4; i++) {
            System.out.print("\nSport Name = ");
            String sports = input.nextLine();
            for (int a = 1; a <= 5; a++) {
                System.out.print("Polytechnic Name = ");
                String polytechnic = input.nextLine();
                System.out.print("Athlete name # 1: ");
                String name1 = input.nextLine();
                System.out.print("Athlete name # 2: ");
                String name2 = input.nextLine();
                System.out.print("Athlete name # 3: ");
                String name3 = input.nextLine();
                System.out.print("Athlete name # 4: ");
                String name4 = input.nextLine();
                System.out.print("Athlete name # 5: ");
                String name5 = input.nextLine();
            }
        }
    }
}