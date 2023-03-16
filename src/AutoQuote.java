import java.time.LocalDate;

/**
 * The AutoQuote class contains data about auto quotes.
 *
 * @author Daniel Condon
 * @Date 2023-02-24
 */

public class AutoQuote extends Quote
{
    private static Vehicle vehicle;
    private static Driver driver;

    /**
     * Instantiates a new AutoQuote
     *
     * @param startDate       the start date
     * @param endDate         the end date
     * @param selectedDriver  the driver
     * @param selectedVehicle the vehicle
     */
    public AutoQuote(LocalDate startDate, LocalDate endDate, Driver selectedDriver, Vehicle selectedVehicle)
    {
        super(startDate, endDate);
        vehicle = selectedVehicle;
        driver = selectedDriver;
    }

    /**
     * gets vehicle
     *
     * @return vehicle
     */
    public static Vehicle getVehicle()
    {
        return vehicle;
    }

    /**
     * Getter for insuredDriver
     *
     * @return The driver insured by the policy
     */
    public Driver getDriver()
    {
        return driver;
    }

    double calculateAutoQuote()
    {
        final double premium = 750;
        final int age = driver.getAge();
        final int accidents = driver.getNumberAccidents();
        final int vehicleAge = LocalDate.now()
                .getYear() - vehicle.getYear();

        final double ageFactor = age < 25 ? 2.0 : 1.0;
        final double accidentFactor = accidents >= 2 ? 2.5 : accidents == 1 ? 1.25 : 1.0;
        final double vehicleAgeFactor;
        if (vehicleAge < 5)
        {
            vehicleAgeFactor = 1.0;
        }
        else if (vehicleAge >= 5 && vehicleAge < 10)
        {
            vehicleAgeFactor = 1.5;
        }
        else
        {
            vehicleAgeFactor = 2.5;
        }

        final double totalFactor = ageFactor * accidentFactor * vehicleAgeFactor;
        return premium * totalFactor;
    }
}
