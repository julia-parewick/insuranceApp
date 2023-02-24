import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The HomeQuote class contains data about home quotes.
 * @Date 2023-02-24
 * @author Mason Seward
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
     * @param home             the home
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
     * @param home the home
     */
    public void setHome(Home home)
    {
        this.home = home;
    }

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
            default -> heatingType = 6;
        }

        double valuefactor = value > 250000 ? 0.2 : 0;
        double ageFactor = age > 25 ? 1.25 : 0;
        double heatFactor = heatingType==1 ? 1.00 : heatingType==2 ? 1.00 : heatingType==3 ? 2.00 : heatingType==4 ? 1.25 : heatingType==5 ? 1.00 : null;
        double locationFactor = home.isUrban() ? 1.00 : 1.25;

        double totalFactor =  valuefactor*ageFactor*heatFactor*locationFactor;
        return premium*totalFactor;
    }
}
