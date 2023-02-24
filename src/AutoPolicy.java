import java.time.LocalDate;

/**
 * @Author Daniel Condon
 * @Date 2023-02-22
 * Descriptive class for customer's auto insurance policy
 */
public class AutoPolicy extends Policy {
    /**
     * Insured driver
     */
    private Driver driver;

    /**
     * Insured vehicle
     */
    private Vehicle vehicle;

    /**
     * Constructor for AutoPolicy class
     * @param customer The customer who holds the policy
     * @param startDate The start date of the policy
     * @param endDate The end date of the policy
     * @param insuredDriver The driver insured by the policy
     * @param insuredVehicle The vehicle insured by the policy
     */
    public AutoPolicy(Customer customer, LocalDate startDate, LocalDate endDate, Driver driver, Vehicle vehicle) {
        super(customer, startDate, endDate);
        this.driver = driver;
        this.vehicle = vehicle;
    }

    /**
     * Getter for insuredDriver
     * @return The driver insured by the policy
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Getter for insuredVehicle
     * @return The vehicle insured by the policy
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Calculates premium for policy based on age, number of accidents, and vehicle age
     * @return premium
     */
    public double calculatePremium() {
        AutoQuote quote = new AutoQuote(super.startDate, super.endDate, Quote.getPremiumBeforeTax(), driver, vehicle);

        return quote.calculateAutoQuote() * 1.15;
    }
}
