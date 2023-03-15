import java.time.LocalDate;

/**
 * The HomeQuote class contains data about home quotes.
 *
 * @author Mason Seward, Julia Parewick
 * @Date 2023-02-24
 */
public class HomeQuote extends Quote
{
    private static Home home;

    /**
     * Instantiates a new HomeQuote
     *
     * @param startDate    the start date
     * @param endDate      the end date
     * @param selectedHome the home
     */
    public HomeQuote(LocalDate startDate, LocalDate endDate, Home selectedHome)
    {
        super(startDate, endDate);
        home = selectedHome;
    }

    /**
     * gets home
     *
     * @return home
     */
    public static Home getHome()
    {
        return home;
    }

    /**
     * calculates the quote for a home
     *
     * @return the home quote
     */
    double calculateHomeQuote()
    {
        final double premium = 500;
        final int value = home.getValue();
        final int age = home.calculateAge();
        final int heatingType;
        final Home.HeatingType type = home.getHeatingType();
        switch (type)
        {
            case ELECTRIC -> heatingType = 1;
            case GAS -> heatingType = 2;
            case OIL -> heatingType = 3;
            case WOOD -> heatingType = 4;
            case OTHER -> heatingType = 5;
            default -> heatingType = 0;
        }
        final double valueFactor = value > 250000 ? value*0.002 : 0;
        final double ageFactor = age > 25 ? 1.25 : 1.0;
        final double heatFactor = heatingType == 1 ? 1.00 : heatingType == 2 ? 1.00 : heatingType == 3 ? 2.00 :
                heatingType == 4 ? 1.25 : 1.00;
        final double locationFactor = home.isUrban() ? 1.00 : 1.25;

        final double totalFactor = ageFactor * heatFactor * locationFactor;

        return ((premium + valueFactor) * totalFactor);
    }
}
