import java.time.LocalDate;

public class HomeTest {
    static Customer customer = new Customer("Jon","Doe", LocalDate.of(1992,01,01));
    static Home home = new Home(2013,220000,Home.HeatingType.ELECTRIC,Home.Location.URBAN);

    public static void homeQuoteTest(){
        HomeQuote hquote = new HomeQuote(
                LocalDate.of(2023,01,30),
                LocalDate.of(2024,01,30),
                home);
        System.out.printf(
                "Customer: %s %s\nAge:%d\nAge of home: %d\nHeating type: %s\nLocation: %s\nHome Insurance Quote: %.2f\n",customer.getFirstName(),customer.getLastName(),LocalDate.now().getYear()-customer.getDob().getYear(),home.calculateAge(),home.getHeatingType(),home.getLocation(),hquote.calculateHomeQuote()
        );
    }

    public static void homePolicyTest(){
        HomePolicy hpolicy = new HomePolicy(
                customer,
                LocalDate.of(2023,01,30),
                LocalDate.of(2024,01,30),
                home
        );
        System.out.println("Home Policy Total: "+hpolicy.calculatePremium());
    }

    public static void main(String[] args) {
        homeQuoteTest();
        homePolicyTest();
    }
}
