import java.time.LocalDate;

/**
 * The test class for the auto classes
 *
 * @author mason seward
 */
public class AutoTests
{
   private static final LocalDate startDate = LocalDate.of(2022, 1, 30);
   private static final LocalDate endDate = LocalDate.of(2023, 1, 30);
   private static final Vehicle civ = new Vehicle("Honda", "Civic", 2014);
   private static final Customer customer = new Customer("Luna","The Cat", LocalDate.of(2022,7,5));
   private static Driver driver = new Driver("Mason", "Seward", 20, 1, "#3 Ridge Rd");

    private static void autoQuoteTest()
    {
        System.out.println("QUOTE TEST");
        AutoQuote aq = new AutoQuote(startDate, endDate, driver, civ);
        System.out.printf("""
                        Driver: %s
                        Number of Accidents: %d
                        Car Model: %s
                        Estimated start date: %s
                        Estimated end date: %s
                        Policy quote: %.2f
                        
                        """,
                driver.getFirstName(), driver.getNumberAccidents(), civ.getModel(), startDate, endDate, aq.calculateAutoQuote());
    }

    private static void autoPolicyTest()
    {
        System.out.println("POLICY TEST");
        AutoPolicy ap = new AutoPolicy(
                            customer,
                            startDate,
                            endDate,
                            driver,
                            civ);
        double policyQuote = ap.calculatePremium();
        System.out.printf("""
                        Customer: %s
                        Starting on: %s
                        Ending on: %s
                        Primary Driver: %s
                        Car Information: %s %s %s
                        Number of Accidents: %d
                        Policy cost: $%.2f
                        
                        """,
                                customer.getFirstName(),
                                startDate,
                                endDate,
                                driver,
                                civ.getYear(),
                                civ.getMake(),
                                civ.getModel(),
                                driver.getNumberAccidents(),
                                policyQuote);
    }

    public static void main(String[] args)
    {
        autoQuoteTest();
        autoPolicyTest();
        driver = new Driver("Mason", "Seward", 20, 4, "#3 Ridge Rd");
        autoPolicyTest();
    }
}
