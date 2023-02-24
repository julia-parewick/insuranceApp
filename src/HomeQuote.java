import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The HomeQuote class contains data about home quotes.
 * @Date 2023-02-24
 * @author Mason Seward
 */
public class HomeQuote extends Quote
{
    private Home home;

    /**
     * Instantiates a new HomeQuote
     * @param startDate        the start date
     * @param endDate          the end date
     * @param premiumBeforeTax the premium before tax
     * @param home             the home
     */
    public HomeQuote(LocalDate startDate, LocalDate endDate, BigDecimal premiumBeforeTax, Home home)
    {
        super(startDate, endDate, premiumBeforeTax);
        this.home = home;
    }

    /**
     * gets home
     *
     * @return home
     */
    public Home getHome()
    {
        return home;
    }

    /**
     * sets home
     *
     * @param home the home
     */
    public void setHome(Home home)
    {
        this.home = home;
    }
}
