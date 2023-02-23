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
    private Driver insuredDriver;

    /**
     * Insured vehicle
     */
    private Vehicle insuredVehicle;

    /**
     * Constructor for AutoPolicy class
     * @param customer The customer who holds the policy
     * @param startDate The start date of the policy
     * @param endDate The end date of the policy
     * @param insuredDriver The driver insured by the policy
     * @param insuredVehicle The vehicle insured by the policy
     */
    public AutoPolicy(Customer customer, LocalDate startDate, LocalDate endDate, Driver insuredDriver, Vehicle insuredVehicle) {
        super(customer, startDate, endDate);
        this.insuredDriver = insuredDriver;
        this.insuredVehicle = insuredVehicle;
    }

    /**
     * Getter for insuredDriver
     * @return The driver insured by the policy
     */
    public Driver getInsuredDriver() {
        return insuredDriver;
    }

    /**
     * Getter for insuredVehicle
     * @return The vehicle insured by the policy
     */
    public Vehicle getInsuredVehicle() {
        return insuredVehicle;
    }

    /**
     * Calculates premium for policy based on age, number of accidents, and vehicle age
     * @return premium
     */
    public double calculatePremium() {
        double basePremium = 750.00;
        int age = insuredDriver.getAge();
        int accidents = insuredDriver.getNumberAccidents();
        int vehicleAge = LocalDate.now().getYear() - insuredVehicle.getYear();

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
        return basePremium * totalFactor;
    }
}
