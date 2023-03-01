import java.time.LocalDate;

/**
 * The test class for the auto classes
 *
 * @author mason seward
 */
public class AutoTesters
{
    static Vehicle civ = new Vehicle("Honda", "Civic", 2014);
    static Driver driver = new Driver("Mason", "Seward", 20, 1, "#3 Ridge Rd");

    private static void autoQuoteTest()
    {
        AutoQuote aq = new AutoQuote(LocalDate.of(2022, 1, 30), LocalDate.of(2023, 1, 30), driver, civ);
        System.out.println("Your auto quote is: $" + aq.calculateAutoQuote());
    }

    private static void autoPolicyTest()
    {
        System.out.println("Auto policy not yet implemented");
    }

    public static void main(String[] args)
    {
        autoQuoteTest();
        autoPolicyTest();
    }
}
