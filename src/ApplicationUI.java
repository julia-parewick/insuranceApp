import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ApplicationUI
{
    public static void main(String[] args) throws SQLException
    {
        Library library = InsuranceDatabaseManager.loadLibrary();
        int choice = determineUserInput();

        switch (choice)
        {
            case 1:
                System.out.print("Enter First Name: ");
                String firstName = String.valueOf(new Scanner(System.in).nextLine());
                System.out.print("Enter Last Name: ");
                String lastName = String.valueOf(new Scanner(System.in).nextLine());
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(new Scanner(System.in).next());
                System.out.print("Enter Number of Accidents: ");
                int NOA = Integer.parseInt(new Scanner(System.in).next());
                System.out.print("Enter Address: ");
                String address = String.valueOf(new Scanner(System.in).nextLine());

                InsuranceDatabaseManager.addUser(DBConfiguration.establishDBConnection(), library, firstName, lastName, age, NOA, address);
            case 2:
                //editProfile();
            case 3:
                //quotePolicy();
            case 4:
                //renewPolicy();
            case 5:
                //cancelPolicy();
        }
    }

    private static int determineUserInput()
    {
        displayMenu();
        System.out.print("Enter Choice: ");
        return Integer.parseInt(new Scanner(System.in).next());
    }

    private static void displayMenu()
    {
        System.out.println("Welcome to Taylor's Insurance. Please choose an option below: ");
        System.out.println("1. Create new user\n2. Edit Profile\n3. Quote a policy\n4. Renew a policy\n5. Cancel a policy");
    }
}