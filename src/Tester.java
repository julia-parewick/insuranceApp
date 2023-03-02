import java.time.LocalDate;

/**
 * @Author Adam Elliott
 * @Date 2023-02-28
 * Descriptive class for a Tester object
 */

public class Tester {

    public static void main(String[] args) {
        Driver driver = new Driver("Adam", "Elliott", 17, 1, "13 Deadend Dr");
        Accidents accident = new Accidents(LocalDate.of(2021, 2, 22), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName()); // print the driver's name
        System.out.println("Date of accident: " + accident.getDate());

        accident = new Accidents(LocalDate.of(2021, 2, 23), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName()); // print the driver's name
        System.out.println("Date of accident: " + accident.getDate());

        accident = new Accidents(LocalDate.of(2021, 2, 24), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName());
        System.out.println("Date of accident: " + accident.getDate());
        System.out.println("Driver's name: " + driver.getFirstName() + " " + driver.getLastName()); // print the driver's name
        System.out.println("Date of accident: " + accident.getDate());
    }
}
