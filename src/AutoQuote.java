import java.time.LocalDate;

/**
 * The AutoQuote class contains data about auto quotes.
 * @Date 2023-02-24
 * @author Daniel Condon
 */

public class AutoQuote extends Quote
{
    private static Vehicle vehicle;
    private static Driver driver;
    private static final Double premiumBeforeTax = getPremiumBeforeTax();

    /**
     * Instantiates a new AutoQuote
     * @param startDate        the start date
     * @param endDate          the end date
     * @param premiumBeforeTax the premium before tax
     * @param selectedDriver    the driver                         
     * @param selectedVehicle   the vehicle
     */
    public AutoQuote(LocalDate startDate, LocalDate endDate, Double premiumBeforeTax, Driver selectedDriver, Vehicle selectedVehicle)
    {
        super(startDate, endDate, premiumBeforeTax);
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
     * sets vehicle
     *
     * @param vehicle - the vehicle
     */
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     * Getter for insuredDriver
     * @return The driver insured by the policy
     */
    public Driver getDriver()
    {
        return driver;
    }
    
    /**
     * sets driver
     *
     * @param driver - the driver
     */
    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }
    

    public double calculateAutoQuote()
    {
        double premium = premiumBeforeTax;
        int age = driver.getAge();
        int accidents = driver.getNumberAccidents();
        int vehicleAge = LocalDate.now().getYear() - vehicle.getYear();

        double ageFactor = age < 25 ? 2.0 : 1.0;
        double accidentFactor = accidents >= 2 ? 2.5 : accidents == 1 ? 1.25 : 1.0;
        double vehicleAgeFactor;
        if (vehicleAge < 5) {
            vehicleAgeFactor = 1.0;
        } else if (vehicleAge >= 5 && vehicleAge < 10) {
            vehicleAgeFactor = 1.5;
        } else {
            vehicleAgeFactor = 2.5;
        }

        double totalFactor = ageFactor * accidentFactor * vehicleAgeFactor;
        return premium * totalFactor;
    }
}
