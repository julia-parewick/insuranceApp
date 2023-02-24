import java.time.LocalDate;
/**
 * @Author Julia Parewick
 * @Date 2023-02-24
 * Abstract class for a customer's insurance policy
 */
public class HomePolicy extends Policy{
    /**
     * a Home object representing the subject of the Policy
     */
    private Home home;

    /**
     * constructor
     * @param customer
     * @param startDate
     * @param endDate
     * @param home
     */
    public HomePolicy(Customer customer, LocalDate startDate, LocalDate endDate, Home home){
        super(customer,startDate,endDate);
        this.home=home;
    }

    /**
     * getter
     * @return Home
     */
    public Home getHome(){
        return this.home;
    }

    /**
     * Calculates the home premium based on factors provided by Home object
     * @return double
     */
    public double calculatePremium(){
        double basePremium=500.00;
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
        return basePremium*totalFactor;
    }
}
