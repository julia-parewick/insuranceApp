import java.time.LocalDate;

/**
 * @Author Julia Parewick
 * @Date 2023-02-24
 * Abstract class for a customer's insurance policy
 */
public class HomePolicy extends Policy
{
    /**
     * a Home object representing the subject of the Policy
     */
    private final Home home;

    /**
     * constructor
     *
     * @param customer      The customer.
     * @param startDate     The policy start date.
     * @param endDate       The policy end date.
     * @param home          The home.
     */
    public HomePolicy(Customer customer, LocalDate startDate, LocalDate endDate, Home home)
    {
        super(customer, startDate, endDate);
        this.home = home;
    }

    public static void main(String[] args)
    {
        HomePolicy h = new HomePolicy(new Customer("Test", "testing", LocalDate.of(1992, 1, 1)),
                LocalDate.of(2023, 1, 30),
                LocalDate.of(2024, 1, 30),
                new Home(2013, 220000, Home.HeatingType.ELECTRIC, Home.Location.URBAN));
        System.out.println("Your home policy costs: $" + h.calculatePremium());
    }

    /**
     * getter
     *
     * @return Home
     */
    public Home getHome()
    {
        return this.home;
    }

    /**
     * Calculates the home premium based on factors provided by Home object
     *
     * @return double
     */
    public double calculatePremium()
    {
        HomeQuote quote = new HomeQuote(super.startDate, super.endDate, home);

        return quote.calculateHomeQuote() * 1.15;
    }
}
