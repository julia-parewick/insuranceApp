import java.time.LocalDate;

/**
 * @Author Adam Elliott
 * @Date 2023-02-28
 * Descriptive class for an Tester object
 */

public class Tester {

    public static void main(String[] args) {
        Driver driver = new Driver("Adam", "Elliott", "123456789", LocalDate.of(1999, 12, 31));
        Accidents accident = new Accidents(LocalDate.of(2021, 2, 22), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName()); // print the driver's name
        System.out.println("Date of accident: " + accident.getDate());

        accident = new Accidents(LocalDate.of(2021, 2, 23), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName()); // print the driver's name
        System.out.println("Date of accident: " + accident.getDate());

        accident = new Accidents(LocalDate.of(2021, 2, 24), driver);
        System.out.println("Driver's name: " + accident.getDriverAtFault().getFirstName() + " " + accident.getDriverAtFault().getLastName());
        System.out.println("Date of accident: " + accident.getDate());
        System.out.println("Driver's name: " + driver.getAccidents().get(0).getDriverAtFault().getFirstName() + " " + driver.getAccidents().get(0).getDriverAtFault().getLastName()); // print the driver's name
        System.out.println("Date of accident: " + driver.getAccidents().get(0).getDate());
    }
