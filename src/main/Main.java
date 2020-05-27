package src.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBConnect dbConnect = new DBConnect();
        Commands commands = new Commands(dbConnect);

        boolean loggedIn = false;
        while (true) {
            System.out.print("Menu\n1.\tLogin\n2.\tShow All the hotels\n10.\tExit\nSelect Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter Username: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    loggedIn = true;
                    System.out.println("You have logged in to the system.");
                    break;
                case 2:
                    if(!loggedIn){
                        System.out.println("You should login to the application first.");
                        break;
                    }
                    System.out.println("Hotels");
                    System.out.println("---------------------");
                    commands.ShowAllHotels();
                    System.out.println("---------------------");
                    break;
                case 10:
                    dbConnect.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice.");
            }
            System.out.println();
        }

    }
}
