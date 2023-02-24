import java.time.LocalDate;

/**
 * The HomeQuote class contains data about home quotes.
 * @Date 2023-02-24
 * @author Mason Seward, Julia Parewick
 */
public class HomeQuote extends Quote
{
    private static Home home;
    private static final Double premiumBeforeTax = getPremiumBeforeTax();

    /**
     * Instantiates a new HomeQuote
     * @param startDate        the start date
     * @param endDate          the end date
     * @param premiumBeforeTax the premium before tax
     * @param selectedHome     the home
     */
    public HomeQuote(LocalDate startDate, LocalDate endDate, Double premiumBeforeTax, Home selectedHome)
    {
        super(startDate, endDate, premiumBeforeTax);
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
     * sets home
     *
     * @param newHome the new home
     */
    public void setHome(Home newHome)
    {
        home = newHome;
    }

    /**
     * calculates the quote for a home
     *
     * @return the home quote
     */
    public double calculateHomeQuote()
    {
        Home home = getHome();
        double premium = premiumBeforeTax;
        int value = home.getValue();
        int age = home.calculateAge();
        int heatingType;
        Home.HeatingType type = home.getHeatingType();
        switch(type){
            case ELECTRIC -> heatingType = 1;
            case GAS -> heatingType = 2;
            case OIL -> heatingType = 3;
            case WOOD -> heatingType = 4;
            case OTHER -> heatingType = 5;
            default -> heatingType = 0;
        }
        double valueFactor = value > 250000 ? 0.2 : 1.0;
        double ageFactor = age > 25 ? 1.25 : 1.0;
        double heatFactor = heatingType==1 ? 1.00 : heatingType==2 ? 1.00 : heatingType==3 ? 2.00 :
                heatingType==4 ? 1.25 : 1.00;
        double locationFactor = home.isUrban() ? 1.00 : 1.25;

        double totalFactor =  valueFactor * ageFactor * heatFactor * locationFactor;

        return premium * totalFactor;
    }
}
